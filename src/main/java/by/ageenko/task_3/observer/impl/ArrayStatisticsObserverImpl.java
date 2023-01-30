package by.ageenko.task_3.observer.impl;

import by.ageenko.task_3.entity.ArrayStatistics;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.entity.Warehouse;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.observer.ArrayStatisticsObserver;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {
    @Override
    public void changeArrayElement(CustomArray customArray) throws CustomArrayException {
        ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
        int id = customArray.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, arrayStatistics);
    }
}
