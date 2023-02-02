package by.ageenko.task_3.observer.impl;

import by.ageenko.task_3.entity.ArrayStatistics;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.entity.Warehouse;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.observer.ArrayStatisticsObserver;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {
    static Logger logger = LogManager.getLogger();

    @Override
    public void changeArrayElement(CustomArray customArray) {
        try {
            ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
            int id = customArray.getArrayId();
            Warehouse warehouse = Warehouse.getInstance();
            warehouse.put(id, arrayStatistics);
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Array is empty = {}", customArray);
        }
    }
}
