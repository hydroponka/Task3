package by.ageenko.task_3.entity;

import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.StringJoiner;

public class ArrayStatistics {
    private int sum;
    private double average;
    private int max;
    private int min;

    public ArrayStatistics(CustomArray customArray) throws CustomArrayException {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        this.sum = arrayCalculationService.sum(customArray).getAsInt();
        this.average = arrayCalculationService.average(customArray).getAsDouble();
        this.max = arrayCalculationService.max(customArray).getAsInt();
        this.min = arrayCalculationService.min(customArray).getAsInt();
    }

    public int getSum() {
        return sum;
    }


    public double getAverage() {
        return average;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayStatistics.class.getSimpleName() + "[", "]")
                .add("sum=" + sum)
                .add("average=" + average)
                .add("max=" + max)
                .add("min=" + min)
                .toString();
    }
}
