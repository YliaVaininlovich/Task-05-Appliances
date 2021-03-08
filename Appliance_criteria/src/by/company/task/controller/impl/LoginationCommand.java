package by.company.task.controller.impl;

import by.company.task.controller.Command;
import by.company.task.service.ClientService;
import by.company.task.service.ServiceException;
import by.company.task.service.ServiceProvider;

public class LoginationCommand implements Command {
    @Override
    public String execute(String request) {

        String login;
        String password;
        String response = " ";

        login = request.split(" ")[1];
        password = request.split(" ")[2];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        ClientService clientService = serviceProvider.getClientService();


        try {
            boolean result = clientService.logination(login, password);
            if (result==true) {
                response="логинация прошла успешно";
            }else {
                response="ошибка логинации";
            }
        } catch (ServiceException e) {
            System.out.println("ошибка при работе с файлом пользователей");
        }

        return response;
    }
}
