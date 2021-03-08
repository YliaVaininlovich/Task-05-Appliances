package by.company.task.controller.impl;

import by.company.task.controller.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("logination", new LoginationCommand());
        commands.put("changeprofile", new ChangeProfileCommand());
        commands.put("findbycategory", new FindByCategoryCommand());
        commands.put("sortLaptop", new SortLaptopCommand());
        commands.put("viewAll", new ViewAllCommand());
        commands.put("nocommand", new NoFoundCommand());
    }

    public Command getCommand(String commandName) {
        Command command;

        command = commands.get(commandName);
        if(command == null) {
            command = commands.get("nocommand");
        }

        return command;

    }

}
