package by.ageenko.task_3.creator;

import by.ageenko.task_3.entity.CustomArray;

import java.util.List;

public interface CustomArrayCreator {
    CustomArray createCustomArray(int[] array);

    List<CustomArray> createCustomArray(List<int[]> array);
}
