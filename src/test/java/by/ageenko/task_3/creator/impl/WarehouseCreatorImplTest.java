package by.ageenko.task_3.creator.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseCreatorImplTest {

    @Test
    void statisticCreatorFromListObject() throws IOException, CustomArrayException {
        ArrayReaderImpl readerArray = new ArrayReaderImpl();
        List<CustomArray> customArrayList = readerArray.readerInList("data//IncorrectArray.txt");
        WarehouseCreatorImpl warehouseCreator = new WarehouseCreatorImpl();
        System.out.println(warehouseCreator.statisticCreatorFromListObject(customArrayList));
    }

    @Test
    void statisticCreatorFromListArray() {
        WarehouseCreatorImpl warehouseCreator = new WarehouseCreatorImpl();
        List<int[]> array = new ArrayList<>();
        System.out.println( warehouseCreator.statisticCreatorFromListArray(array));
    }
}