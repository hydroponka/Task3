package by.ageenko.task_3.creator.impl;

import by.ageenko.task_3.creator.WarehouseCreator;
import by.ageenko.task_3.entity.ArrayStatistics;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.entity.Warehouse;
import by.ageenko.task_3.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class WarehouseCreatorImpl implements WarehouseCreator {
static Logger logger = LogManager.getLogger();
    @Override
    public Warehouse statisticCreatorFromListObject(List<CustomArray> customArrays) {
        Warehouse warehouse = Warehouse.getInstance();
        try {
            for (CustomArray customArray : customArrays) {
                ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
                warehouse.put(customArray.getArrayId(), arrayStatistics);
            }
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Array is empty");
        }
        return warehouse;
    }

    @Override
    public Warehouse statisticCreatorFromListArray(List<int[]> arrays) {
        Warehouse warehouse = Warehouse.getInstance();
        List<CustomArray> customArrays = new ArrayList<>();
        try {
            for (int[] i : arrays) {
                customArrays.add(new CustomArray(i));
            }
            for (CustomArray customArray : customArrays) {
                ArrayStatistics arrayStatistics = new ArrayStatistics(customArray);
                warehouse.put(customArray.getArrayId(), arrayStatistics);
            }
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Array is empty");
        }
        return warehouse;
    }
}
