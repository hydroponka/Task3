package by.ageenko.task_3.creator;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.entity.Warehouse;

import java.util.List;

public interface WarehouseCreator {
    Warehouse statisticCreatorFromListObject(List<CustomArray> customArrays);
    Warehouse statisticCreatorFromListArray(List<int[]> arrays);
}
