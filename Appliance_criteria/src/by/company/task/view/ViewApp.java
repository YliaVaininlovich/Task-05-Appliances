package by.company.task.view;

import by.company.task.bean.Appliance;
import by.company.task.bean.Laptop;

import java.util.List;

public class ViewApp {

    public void PrintAll(List<Appliance> app) {
        for (Appliance appliance : app) {
            System.out.println(appliance);
        }
    }

    public void PrintLaptop(List<Laptop> app) {
        for (Laptop appliance : app) {
            System.out.println(appliance);
        }
    }
}
