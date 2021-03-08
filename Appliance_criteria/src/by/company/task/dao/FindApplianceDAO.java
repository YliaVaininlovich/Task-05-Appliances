package by.company.task.dao;

import by.company.task.bean.Appliance;
import by.company.task.controller.Criteria;

import java.util.List;

public interface FindApplianceDAO {

    List<Appliance> FindByCategory(String categoty) throws DAOException;

    List<Appliance> FindAppliance(Criteria criteria) throws DAOException;
}
