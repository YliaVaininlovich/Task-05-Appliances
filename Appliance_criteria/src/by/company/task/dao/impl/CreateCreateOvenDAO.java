package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.Oven;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class CreateCreateOvenDAO implements CreateAppDAO {
    private int power_consumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    @Override
    public void createApp(String request, List<Appliance> app) {
        String[] subStr;
        subStr = request.split(", ");
        power_consumption = Integer.parseInt(subStr[0].split("=")[1]);
        weight = Integer.parseInt(subStr[1].split("=")[1]);
        capacity = Integer.parseInt(subStr[2].split("=")[1]);
        depth = Integer.parseInt(subStr[3].split("=")[1]);
        height = Double.parseDouble(subStr[4].split("=")[1]);
        width = Double.parseDouble(subStr[5].split("=")[1]);
        app.add(new Oven(power_consumption,  weight,  capacity,  depth, height,  width));
    }
}

