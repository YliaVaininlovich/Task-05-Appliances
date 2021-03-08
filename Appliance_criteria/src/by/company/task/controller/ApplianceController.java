package by.company.task.controller;

import by.company.task.controller.impl.CommandProvider;
import by.company.task.service.ServiceException;

import java.io.FileNotFoundException;

public class ApplianceController implements Controller {

       private final CommandProvider provider = new CommandProvider();

    public String doAction(String request)  {
        String commandName;
        String response = " ";

        commandName = request.split(" ", 2)[0];

       Command command;
       command = provider.getCommand(commandName);
        try {
            response = command.execute(request);
        } catch (ServiceException e) {
            System.out.println(e);
        }

        return response;
    }

}
