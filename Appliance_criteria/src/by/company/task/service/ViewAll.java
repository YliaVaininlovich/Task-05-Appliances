package by.company.task.service;

import by.company.task.bean.Appliance;
import by.company.task.dao.DAOException;

import java.util.List;

public interface ViewAll {
    List<Appliance> ViewAllAppliance() throws ServiceException;
}
