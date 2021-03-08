package by.company.task.service;

import by.company.task.bean.Laptop;


import java.util.List;

public interface SortLaptop {

    List<Laptop> sortLaptopField(String field) throws ServiceException;
}
