package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.Laptop;
import by.company.task.dao.DAOException;
import by.company.task.dao.SortApplianseDAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLaptopDAO implements SortApplianseDAO  {

    public List<Laptop> sortLaptopBattery() throws DAOException {
        List<Appliance> applianceList = new ArrayList<Appliance>();
        OpenData openData = new OpenData();
        applianceList = openData.openData();

        List<Laptop> laptops = new ArrayList<Laptop>();
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Laptop) {
                laptops.add((Laptop) appliance);
            }
        }
        Collections.sort(laptops);
        return laptops;
    }

    public List<Laptop> sortLaptopMemory() throws DAOException {

        List<Appliance> applianceList = new ArrayList<Appliance>();
        OpenData openData = new OpenData();
        applianceList = openData.openData();

        List<Laptop> laptops = new ArrayList<Laptop>();
        for (Appliance appliance : applianceList) {
            if (appliance instanceof Laptop) {
                laptops.add((Laptop) appliance);
            }
        }
        Collections.sort(laptops, new LaptopComparator());
        return laptops;
    }
}
