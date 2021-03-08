package by.company.task.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {
    private String groupSearchName;
    private Map<String, Object> criteriaMap = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }

    public List<String> get (){
        List<String> filteredData = new ArrayList<String>();

        for(Map.Entry<String, Object> oneCriteris : criteriaMap.entrySet()){
            filteredData.add(oneCriteris.getKey().toString()+"="+oneCriteris.getValue().toString());
        }
        return filteredData;
    }

}
