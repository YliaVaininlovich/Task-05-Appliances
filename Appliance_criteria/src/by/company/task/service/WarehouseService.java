package by.company.task.service;

import by.company.task.bean.Appliance;
import by.company.task.controller.Criteria;
import by.company.task.dao.DAOException;

import java.util.List;

public interface WarehouseService {
    List<Appliance> FindByCategory(String categoty) throws ServiceException;

    public List<Appliance> find(Criteria criteria) throws ServiceException;

}
