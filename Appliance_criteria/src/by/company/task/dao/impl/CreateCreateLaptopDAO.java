package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.Laptop;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class CreateCreateLaptopDAO implements CreateAppDAO {

    private double battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private double cpu;
    private int display_inchs;

    @Override
    public void createApp(String request, List<Appliance> app) {
        String[] subStr;
        subStr = request.split(", ");
        battery_capacity = Double.parseDouble(subStr[0].split("=")[1]);
        os = subStr[1].split("=")[1];
        memory_rom = Integer.parseInt(subStr[2].split("=")[1]);
        system_memory = Integer.parseInt(subStr[3].split("=")[1]);
        cpu = Double.parseDouble(subStr[4].split("=")[1]);
        display_inchs = Integer.parseInt(subStr[5].split("=")[1]);
        app.add(new Laptop(battery_capacity, os, memory_rom, system_memory,  cpu, display_inchs));
    }
}
