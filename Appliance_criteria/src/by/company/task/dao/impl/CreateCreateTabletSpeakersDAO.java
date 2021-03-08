package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.bean.Speakers;
import by.company.task.dao.CreateAppDAO;

import java.util.List;

public class CreateCreateTabletSpeakersDAO implements CreateAppDAO {

    private int  power_consumption;
    private int  number_of_speakers;
    private String  frequency_range;
    private int  cord_length;

    @Override
    public void createApp(String request, List<Appliance> app) {
        String[] subStr;
        subStr = request.split(", ");
        power_consumption = Integer.parseInt(subStr[0].split("=")[1]);
        number_of_speakers = Integer.parseInt(subStr[1].split("=")[1]);
        frequency_range = subStr[2].split("=")[1];
        cord_length = Integer.parseInt(subStr[3].split("=")[1]);

        app.add(new Speakers(power_consumption, number_of_speakers, frequency_range,  cord_length));
    }
}
