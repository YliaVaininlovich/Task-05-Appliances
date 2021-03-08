package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.VacuumCleaner;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class CreateCreateVacuumCleanerDAO implements CreateAppDAO {
    private int power_consumption;
    private String  filter_type;
    private String  bag_type;
    private String  wand_type;
    private int  motor_speed_regulation;
    private int  cleaning_width;

    @Override
    public void createApp(String request, List<Appliance> app) {
        String[] subStr;
        subStr = request.split(", ");
        power_consumption = Integer.parseInt(subStr[0].split("=")[1]);
        filter_type = subStr[1].split("=")[1];
        bag_type = subStr[2].split("=")[1];
        wand_type = subStr[3].split("=")[1];
        motor_speed_regulation = Integer.parseInt(subStr[4].split("=")[1]);
        cleaning_width = Integer.parseInt(subStr[5].split("=")[1]);
        app.add(new VacuumCleaner(power_consumption,  filter_type,  bag_type, wand_type, motor_speed_regulation,  cleaning_width));

    }
}
