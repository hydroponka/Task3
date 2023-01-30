package by.ageenko.task_3.creator;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.repository.ArrayRepository;

import java.util.List;

public interface RepositoryCreator {
    ArrayRepository createFromListObject(List<CustomArray> customArrays);

    ArrayRepository createFromListArray(List<int[]> arrays);
}
