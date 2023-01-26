package by.ageenko.task_3.main;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomArrayException {
        ArrayReaderImpl readerArray = new ArrayReaderImpl();
        List<CustomArray> customArrayList = readerArray.readerInList("data//EmptyArray.txt");
        CustomArray customArrayList1 = readerArray.reader("data//EmptyArray.txt");
        System.out.println(customArrayList);
    }
}
