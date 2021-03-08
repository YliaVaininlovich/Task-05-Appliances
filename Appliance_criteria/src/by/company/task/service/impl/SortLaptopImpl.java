package by.company.task.service.impl;

import by.company.task.bean.Laptop;
import by.company.task.dao.DAOException;
import by.company.task.dao.SortApplianseDAO;
import by.company.task.dao.impl.SortLaptopDAO;
import by.company.task.service.ServiceException;
import by.company.task.service.SortLaptop;

import java.util.ArrayList;
import java.util.List;

public class SortLaptopImpl implements SortLaptop {
    @Override
    public List<Laptop> sortLaptopField(String field) throws ServiceException {

        if (field == null || "".equals(field))
            throw new ServiceException("error field is null");

        List<Laptop> laptops = new ArrayList<Laptop>();

        SortApplianseDAO sortApplianseDAO = new SortLaptopDAO();
        if (field.equals("battery_capacity")) {
            try {
                laptops = sortApplianseDAO.sortLaptopBattery();
            } catch (DAOException e){
               throw  new ServiceException(e);
            }


        } else if (field.equals("memory_rom")) {
          try {
              laptops = sortApplianseDAO.sortLaptopMemory();
          } catch (DAOException e){
              throw new ServiceException(e);
          }
        }

        return laptops;
    }
}
