package by.company.task.controller.impl;

import by.company.task.bean.Laptop;
import by.company.task.controller.Command;
import by.company.task.dao.DAOException;
import by.company.task.service.ServiceException;
import by.company.task.service.ServiceProvider;
import by.company.task.service.SortLaptop;
import by.company.task.view.ViewApp;

import java.util.ArrayList;
import java.util.List;

public class SortLaptopCommand implements Command {

    @Override
    public String execute(String request)  {
        String field;
        String response = "товар отсортироан";
        List<Laptop> listSortLaptop = new ArrayList<Laptop>();
        ViewApp view = new ViewApp();
        field = request.split(" ")[1];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        SortLaptop sortLaptop = serviceProvider.getSortLaptop();

            try {
                listSortLaptop = sortLaptop.sortLaptopField(field);
            } catch (ServiceException e) {
                System.out.println("ошибка при работе с базой данных");
            }
            if (listSortLaptop.isEmpty()) {
                response = "товар данной категории отсутствует";
            }

        view.PrintLaptop(listSortLaptop);
        return response;

    }
}
