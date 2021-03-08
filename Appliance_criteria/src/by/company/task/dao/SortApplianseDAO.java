package by.company.task.dao;

import by.company.task.bean.Appliance;
import by.company.task.bean.Laptop;

import java.io.FileNotFoundException;
import java.util.List;

public interface SortApplianseDAO {

    List<Laptop> sortLaptopMemory() throws DAOException;
    List<Laptop> sortLaptopBattery() throws DAOException;
}
