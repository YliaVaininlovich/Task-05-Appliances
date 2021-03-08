package by.company.task.controller.impl;

import by.company.task.bean.Appliance;
import by.company.task.controller.Command;
import by.company.task.dao.DAOException;
import by.company.task.service.ServiceException;
import by.company.task.service.ServiceProvider;
import by.company.task.service.ViewAll;
import by.company.task.view.ViewApp;

import java.util.ArrayList;
import java.util.List;

public class ViewAllCommand implements Command {
    @Override
    public String execute(String request)  {

        String response="";
        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        ViewAll viewAll =serviceProvider.getViewAll();

        List<Appliance> app = new ArrayList<Appliance>();
try {
    app = viewAll.ViewAllAppliance();
    ViewApp view = new ViewApp();
    view.PrintAll(app);
    response="выведен весь товар";
} catch (ServiceException e) {
    System.out.println("не найден файл БД");
}
        return response;
    }
}
