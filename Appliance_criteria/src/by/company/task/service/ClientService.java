package by.company.task.service;

import by.company.task.bean.User;

public interface ClientService {

    boolean logination(String login, String password) throws ServiceException;

    String changeUser(User user, User newUser) throws ServiceException;
}
