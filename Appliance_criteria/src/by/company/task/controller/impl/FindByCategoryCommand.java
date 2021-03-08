package by.company.task.controller.impl;

import by.company.task.bean.Appliance;
import by.company.task.controller.Command;
import by.company.task.service.ServiceException;
import by.company.task.service.ServiceProvider;
import by.company.task.service.WarehouseService;
import by.company.task.view.ViewApp;

import java.util.ArrayList;
import java.util.List;

public class FindByCategoryCommand implements Command {

    @Override
    public String execute(String request) {

        String category;
        String response = "";
        List<Appliance> categoryApplianсe = new ArrayList<Appliance>();
        ViewApp view = new ViewApp();
        category = request.split(" ")[1];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        WarehouseService warehouseService = serviceProvider.getWarehouseService();

        try {
            categoryApplianсe = warehouseService.FindByCategory(category);
        } catch (ServiceException e) {
            response = "база данных временно не доступна";
        }
        if (categoryApplianсe.isEmpty()) {
            response = "товар заданной категории не найден";
        }

        view.PrintAll(categoryApplianсe);
        return response;
    }
}
