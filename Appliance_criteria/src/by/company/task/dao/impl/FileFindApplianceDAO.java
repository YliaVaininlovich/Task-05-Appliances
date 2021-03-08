package by.company.task.dao.impl;

import by.company.task.bean.Appliance;
import by.company.task.controller.Criteria;
import by.company.task.dao.CreateAppDAO;
import by.company.task.dao.DAOException;
import by.company.task.dao.FindApplianceDAO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFindApplianceDAO implements FindApplianceDAO {

    @Override
    public List<Appliance> FindByCategory(String category) {

        List<Appliance> applianceList = new ArrayList<Appliance>();

        try {
            CommandCreateApp commandCreateApp = new CommandCreateApp();
            CreateAppDAO createAppDAO;
            FileReader fr = new FileReader("appliances_db.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            line = reader.readLine();
            String[] categoryStr;

            while (line != null) {
                categoryStr = line.split(" : ", 2);
                if (categoryStr[0].equals(category)) {
                    createAppDAO = commandCreateApp.getCommands(categoryStr[0]);
                    createAppDAO.createApp(categoryStr[1], applianceList);
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return applianceList;
    }

    @Override
    public List<Appliance> FindAppliance(Criteria criteria) throws DAOException {

        List<Appliance> applianceList = new ArrayList<Appliance>();

        List<String> filteredData = new ArrayList<String>();
        filteredData = criteria.get();

        List<Pattern> patterns = new ArrayList<Pattern>();
        for (String filteredDataString : filteredData) {
            patterns.add(Pattern.compile(filteredDataString));
        }

        try {
            CommandCreateApp commandCreateApp = new CommandCreateApp();
            CreateAppDAO createAppDAO;
            FileReader fr = new FileReader("appliances_db.txt");
            BufferedReader reader = new BufferedReader(fr);

            String line;
            line = reader.readLine();
            String[] applianceStr;
            while (line != null) {
                applianceStr = line.split(" : ", 2);
                if (FilterAppliance(applianceStr, criteria, patterns)) {
                    createAppDAO = commandCreateApp.getCommands(applianceStr[0]);
                    createAppDAO.createApp(applianceStr[1], applianceList);
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return applianceList;
    }

    public boolean FilterAppliance(String[] applianceStr, Criteria criteria, List<Pattern> patterns) {
        boolean flag = true;
        Matcher matcher;
        if (applianceStr[0].equals(criteria.getGroupSearchName())) {
            for (Pattern patternString : patterns) {
                matcher = patternString.matcher(applianceStr[1]);
                if (!matcher.find()) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag=false;
        }
        return flag;
    }
}
