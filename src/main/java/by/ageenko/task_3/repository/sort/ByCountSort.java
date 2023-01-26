package by.ageenko.task_3.repository.sort;

import by.ageenko.task_3.entity.CustomArray;

import java.util.Comparator;

public class ByCountSort implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArray().length - o2.getArray().length;
    }
}
