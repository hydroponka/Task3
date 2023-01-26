package by.ageenko.task_3.reader;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;

import java.util.List;

public interface ArrayReader {
    CustomArray reader(String file) throws CustomArrayException;
    List<CustomArray> readerInList(String file) throws CustomArrayException;
}
