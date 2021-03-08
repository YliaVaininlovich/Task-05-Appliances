package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.TabletPC;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class CreateCreateTabletPCDAO implements CreateAppDAO {

    private int battery_capacity;
    private int  display_inches;
    private int  memory_rom;
    private int  flash_memory_capacity;
    private String   color;

    @Override
    public void createApp(String request, List<Appliance> app) {
        String[] subStr;
        subStr = request.split(", ");
        battery_capacity = Integer.parseInt(subStr[0].split("=")[1]);
        display_inches = Integer.parseInt(subStr[1].split("=")[1]);
        memory_rom = Integer.parseInt(subStr[2].split("=")[1]);
        flash_memory_capacity = Integer.parseInt(subStr[3].split("=")[1]);
        color = subStr[4].split("=")[1];
        app.add(new TabletPC(battery_capacity, display_inches, memory_rom,  flash_memory_capacity,  color));

    }
}
