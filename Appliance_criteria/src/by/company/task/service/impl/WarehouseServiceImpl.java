package by.company.task.service.impl;

import by.company.task.bean.Appliance;
import by.company.task.controller.Criteria;
import by.company.task.dao.DAOException;
import by.company.task.dao.FindApplianceDAO;
import by.company.task.dao.impl.FileFindApplianceDAO;

import by.company.task.service.ServiceException;
import by.company.task.service.WarehouseService;

import java.util.ArrayList;
import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {
    @Override
    public List<Appliance> FindByCategory(String category) throws ServiceException {

        if(category == null || "".equals(category))
            throw new ServiceException("error category is null");

        FindApplianceDAO fileFindApplianceDAO = new FileFindApplianceDAO();

        List<Appliance> categoryApplianсe = new ArrayList<Appliance>();
        try {
        categoryApplianсe = fileFindApplianceDAO.FindByCategory(category);
        } catch (DAOException e){
            throw new ServiceException(e);
        }

        return categoryApplianсe;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {

        //валидация критериев!!!

        List<Appliance> appliances = new ArrayList<Appliance>();
        FindApplianceDAO fileFindApplianceDAO = new FileFindApplianceDAO();
        try {
            appliances = fileFindApplianceDAO.FindAppliance(criteria);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return appliances;
    }
}
