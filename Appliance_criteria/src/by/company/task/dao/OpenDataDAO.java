package by.company.task.dao;

import by.company.task.bean.Appliance;

import java.io.FileNotFoundException;
import java.util.List;

public interface OpenDataDAO {
    List<Appliance> openData() throws FileNotFoundException, DAOException;
}
