package by.company.task.controller;

import by.company.task.service.ServiceException;

import java.io.FileNotFoundException;

public interface Command {
    String execute(String request) throws ServiceException;
}
