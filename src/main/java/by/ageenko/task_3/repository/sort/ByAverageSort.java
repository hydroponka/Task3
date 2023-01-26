package by.ageenko.task_3.repository.sort;

import by.ageenko.task_3.entity.CustomArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class ByAverageSort implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return (int) (Arrays.stream(o1.getArray()).average().getAsDouble() - Arrays.stream(o2.getArray()).average().getAsDouble());
    }
}
