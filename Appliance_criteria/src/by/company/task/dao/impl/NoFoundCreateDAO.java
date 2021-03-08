package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class NoFoundCreateDAO implements CreateAppDAO {

    @Override
    public void createApp(String request, List<Appliance> app) {

        return;
    }
}
