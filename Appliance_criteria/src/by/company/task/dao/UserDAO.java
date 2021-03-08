package by.company.task.dao;

import by.company.task.bean.User;

public interface UserDAO {

    boolean logination(String ligin, String password) throws DAOException;

    void changeUser(User user, User newUser) throws DAOException;
}
