package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.dao.CreateAppDAO;
import by.company.task.dao.DAOException;
import by.company.task.dao.OpenDataDAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenData implements OpenDataDAO {

    public List<Appliance> openData()  {

        List<Appliance> app = new ArrayList<Appliance>();

        try {
            CommandCreateApp commandCreateApp = new CommandCreateApp();
            CreateAppDAO createAppDAO;
            FileReader readerFile = new FileReader("appliances_db.txt");
            BufferedReader reader = new BufferedReader(readerFile);
            String line;
            line = reader.readLine();
            String[] subStr;

            while (line != null) {
                subStr = line.split(" : ", 2);
                createAppDAO = commandCreateApp.getCommands(subStr[0]);
                createAppDAO.createApp(subStr[1], app);
                line = reader.readLine();
            }
            readerFile.close();

        } catch (FileNotFoundException e) {
            new DAOException("Файл не найден");

        } catch (IOException e) {
            new DAOException("Файл не найден");
        }

        return app;
    }
}
