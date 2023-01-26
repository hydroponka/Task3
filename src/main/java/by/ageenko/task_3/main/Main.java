package by.ageenko.task_3.main;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.repository.Warehouse;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomArrayException, IOException {
        ArrayReaderImpl readerArray = new ArrayReaderImpl();
        List<CustomArray> customArrayList = readerArray.readerInList("data//IncorrectArray.txt");
        System.out.println(customArrayList);
        Warehouse warehouse = new Warehouse(customArrayList);
        System.out.println(warehouse);
    }
}
