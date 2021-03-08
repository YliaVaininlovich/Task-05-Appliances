package by.company.task.appliance;

import by.company.task.bean.Appliance;

import by.company.task.bean.TabletPC;
import by.company.task.controller.ApplianceController;
import by.company.task.controller.Controller;
import by.company.task.controller.Criteria;
import by.company.task.controller.SearchCriteria;
import by.company.task.service.ServiceException;
import by.company.task.service.ViewAll;
import by.company.task.service.WarehouseService;
import by.company.task.service.impl.ViewAllImpl;
import by.company.task.service.impl.WarehouseServiceImpl;
import by.company.task.view.ViewApp;
import com.sun.glass.ui.View;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Controller controller = (Controller) new ApplianceController();
//        String request;
//        String response;
//        request = "logination admin admin";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        System.out.println("вывод всего каталога");
//        request = "viewAll";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        System.out.println("сортировка планшетов по батарее");
//        request = "sortLaptop battery_capacity";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        System.out.println("сортировка планшетов по объему памяти");
//        request = "sortLaptop memory_rom";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        System.out.println("\nпоиск по категории Refrigerator");
//        request = "findbycategory Refrigerator";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        System.out.println("поиск по категории Computer");
//        request = "findbycategory Computer";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        System.out.println("изменить логин и пароль");
//        request = "changeprofile user user user superuser";
//        response = controller.doAction(request);
//        System.out.println(response);

        System.out.println("поиск по любому критерию");
        System.out.println("микроволновка");
        List<Appliance> appliance = new ArrayList<Appliance>();
        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 45);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

        WarehouseService warehouseService = new WarehouseServiceImpl();
        try {
            appliance = warehouseService.find(criteriaOven);
        } catch (ServiceException e) {
            System.out.println("что-то пошло не так");
        }
        ViewApp view = new ViewApp();
        if (appliance.isEmpty()){
            System.out.println("предметов, удовлетворяющих критерию поиска нет");
        } else {
            view.PrintAll(appliance);
        }

        System.out.println("планшет");
        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

         warehouseService = new WarehouseServiceImpl();
        try {
            appliance = warehouseService.find(criteriaTabletPC);
        } catch (ServiceException e) {
            System.out.println("что-то пошло не так");
        }
        view = new ViewApp();
        if (appliance.isEmpty()){
            System.out.println("предметов, удовлетворяющих критерию поиска нет");
        } else {
            view.PrintAll(appliance);
        }

    }
}
