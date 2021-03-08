package by.company.task.service.impl;

import by.company.task.bean.Appliance;
import by.company.task.dao.DAOException;
import by.company.task.dao.impl.OpenData;
import by.company.task.service.ServiceException;
import by.company.task.service.ViewAll;

import java.util.ArrayList;
import java.util.List;

public class ViewAllImpl implements ViewAll  {
    @Override
    public List<Appliance> ViewAllAppliance() throws ServiceException {

        List<Appliance> app = new ArrayList<Appliance>();
        OpenData openData = new OpenData();
        app = openData.openData();
        return app;
    }
}
