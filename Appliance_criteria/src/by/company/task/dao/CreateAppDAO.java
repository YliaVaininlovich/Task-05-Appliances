package by.company.task.dao;

import by.company.task.bean.Appliance;

import java.util.List;

public interface CreateAppDAO {
    void createApp(String request, List<Appliance> app);
}
