package by.ageenko.task_3.main;

import by.ageenko.task_3.creator.WarehouseCreator;
import by.ageenko.task_3.creator.impl.WarehouseCreatorImpl;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.entity.Warehouse;
import by.ageenko.task_3.repository.ArrayRepository;
import by.ageenko.task_3.repository.sort.ByCountSort;
import by.ageenko.task_3.repository.sort.ByFirstElementSort;
import by.ageenko.task_3.repository.sort.ByIdSort;
import org.apache.logging.log4j.util.PropertySource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomArrayException, IOException {
        CustomArray customArray1 = new CustomArray(new int[]{5, 6, 74, 3, 6});
        CustomArray customArray2 = new CustomArray(new int[]{5, 6, 74, 3, 6});
        CustomArray customArray3 = new CustomArray(new int[]{5, 6, 74, 3, 6});
        List<CustomArray> customArrayList = List.of(customArray1, customArray2);
        WarehouseCreator warehouseCreator = new WarehouseCreatorImpl();
        System.out.println(warehouseCreator.statisticCreatorFromListObject(customArrayList));
    }
}
