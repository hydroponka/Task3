package by.ageenko.task_3.repository.sort;

import by.ageenko.task_3.entity.CustomArray;

import java.util.Comparator;

public class ByFirstElementSort implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int[] customArray1 = o1.getArray();
        int[] customArray2 = o2.getArray();
        return customArray1[0] - customArray2[0];
    }
}
