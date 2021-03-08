package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.Refrigerator;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class CreateCreateRefrigeratorDAO implements CreateAppDAO {

    private int power_consumption;
    private int weight;
    private int freezer_capacity;
    private double overall_capacity;
    private int height;
    private int width;

    @Override
    public void createApp(String request, List<Appliance> app) {
        String[] subStr;
        subStr = request.split(", ");
        power_consumption = Integer.parseInt(subStr[0].split("=")[1]);
        weight = Integer.parseInt(subStr[1].split("=")[1]);
        freezer_capacity = Integer.parseInt(subStr[1].split("=")[1]);
        overall_capacity = Double.parseDouble(subStr[3].split("=")[1]);
        height = Integer.parseInt(subStr[4].split("=")[1]);
        width = Integer.parseInt(subStr[5].split("=")[1]);
        app.add(new Refrigerator(power_consumption,  weight,  freezer_capacity,  overall_capacity, height,  width));
    }
}
