package by.ageenko.task_3;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;

public class main {
    public static void main(String[] args) {
        ArrayReaderImpl readerArray = new ArrayReaderImpl();
        CustomArray array = readerArray.reader("data//IncorrectArray.txt");
        System.out.println(array);
        CustomArray array1 = readerArray.reader("data//CorrectArray.txt");
        System.out.println(array1);
        CustomArray array2 = readerArray.reader("data//EmptyArray.txt");
        System.out.println(array2);
    }
}
