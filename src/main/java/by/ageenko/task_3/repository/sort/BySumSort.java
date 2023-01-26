package by.ageenko.task_3.repository.sort;

import by.ageenko.task_3.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;

public class BySumSort implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return Arrays.stream(o1.getArray()).sum() - Arrays.stream(o2.getArray()).sum();
    }
}
