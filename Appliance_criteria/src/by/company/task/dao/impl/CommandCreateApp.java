package by.company.task.dao.impl;

import by.company.task.dao.CreateAppDAO;

import java.util.HashMap;
import java.util.Map;

public class CommandCreateApp {

    private Map<String, CreateAppDAO> commands = new HashMap<>();

    public CommandCreateApp() {
        commands.put("Oven", new CreateCreateOvenDAO());
        commands.put("Laptop", new CreateCreateLaptopDAO());
        commands.put("Refrigerator", new CreateCreateRefrigeratorDAO());
        commands.put("VacuumCleaner", new CreateCreateVacuumCleanerDAO());
        commands.put("TabletPC", new CreateCreateTabletPCDAO());
        commands.put("Speakers", new CreateCreateTabletSpeakersDAO());
        commands.put("nocommand", new NoFoundCreateDAO());
    }

    public CreateAppDAO getCommands(String commandName) {
        CreateAppDAO createAppDAO;

        createAppDAO = commands.get(commandName);

        if (createAppDAO == null) {
            createAppDAO = commands.get("nocommand");
        }

        return createAppDAO;
    }
}
