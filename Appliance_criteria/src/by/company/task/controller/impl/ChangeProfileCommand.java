package by.company.task.controller.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.User;
import by.company.task.controller.Command;
import by.company.task.service.ClientService;
import by.company.task.service.ServiceException;
import by.company.task.service.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class ChangeProfileCommand implements Command {

    @Override
    public String execute(String request) throws ServiceException {

        String response = " ";

        User user = new User(request.split(" ")[1], request.split(" ")[2]);
        User newUser = new User(request.split(" ")[3], request.split(" ")[4]);


        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        ClientService clientService = serviceProvider.getClientService();

        try {
            response = clientService.changeUser(user, newUser);

        } catch (ServiceException e) {
            System.out.println("ошибка при работе с файлом пользователей");
        }

        return response;
    }
}
