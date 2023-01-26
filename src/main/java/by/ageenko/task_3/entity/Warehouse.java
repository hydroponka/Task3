package by.ageenko.task_3.entity;

import java.util.*;

public class Warehouse {
    private static final Warehouse INSTANCE = new Warehouse();
    private Map<Integer, IntSummaryStatistics> map = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return INSTANCE;
    }
    public void calculateSummaryStatistics(List<CustomArray> customArrays){
        map.clear();
        for (CustomArray array : customArrays){
            map.put(array.getArrayId(), Arrays.stream(array.getArray()).summaryStatistics());
        }
    }
    public String getSummaryStatistics(){
        return map.toString();
    }
}
