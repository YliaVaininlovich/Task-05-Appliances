package by.company.task.controller.impl;

import by.company.task.controller.Command;

public class NoFoundCommand implements Command {

    @Override
    public String execute(String request) {
        return null;
    }
}
