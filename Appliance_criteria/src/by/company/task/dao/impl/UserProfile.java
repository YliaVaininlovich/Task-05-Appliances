package by.company.task.dao.impl;

import by.company.task.bean.User;
import by.company.task.dao.DAOException;
import by.company.task.dao.UserDAO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserProfile implements UserDAO {

    @Override
    public boolean logination(String login, String password) throws DAOException {
        final int LOGIN = 0;
        final int PASSWORD = 1;
        final Path move;
        FileReader reader;
        boolean result = false;
        String user;
        String[] subStr;

        try {
            reader = new FileReader("users.db");

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        }

        try {
            BufferedReader readerBuff = new BufferedReader(reader);
            user = readerBuff.readLine();

            while (user != null) {
                subStr = user.split(" ");
                if (subStr[LOGIN].equals(login) && subStr[PASSWORD].equals(password)) {
                    result = true;
                    break;
                }
                user = readerBuff.readLine();

            }
            reader.close();
            readerBuff.close();
        } catch (IOException e) {
            throw new DAOException(e);
        }
        return result;
    }

    @Override
    public void changeUser(User user, User newUser) throws DAOException {
        final int LOGIN = 0;
        final int PASSWORD = 1;

        FileReader reader;
        boolean result = false;
        String readerBuffUser;
        String[] subStr;
        File file = new File("users.db");
        FileWriter tmpFileUserWriter;
        try {
            tmpFileUserWriter = new FileWriter("users.tmp", false);
        } catch (IOException e) {
            throw new DAOException(e);
        }

       try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        }

        try {
            BufferedReader readerBuff = new BufferedReader(reader);
            readerBuffUser = readerBuff.readLine();

            while (readerBuffUser != null) {
                subStr = readerBuffUser.split(" ");

                if (subStr[LOGIN].equals(user.getLogin()) && subStr[PASSWORD].equals(user.getPassword())) {
                    readerBuffUser = newUser.getLogin() + " " + newUser.getPassword();
                }
                tmpFileUserWriter.write(readerBuffUser);
                tmpFileUserWriter.append('\n');
                readerBuffUser = readerBuff.readLine();
            }

            reader.close();
            readerBuff.close();
            tmpFileUserWriter.close();
            Files.delete(Paths.get("users.db"));
            Path move = Files.move(Paths.get("users.tmp"), Paths.get("users.db"));

        } catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
