package by.ageenko.task_3.service.calculation.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.calculation.ArrayCalculationService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {

    @Override
    public int min(CustomArray customArray) {
        int[] array1 = customArray.getArray();
        int min = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }

    @Override
    public OptionalInt minStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).min();
    }

    @Override
    public int max(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public OptionalInt maxStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).max();
    }

    @Override
    public double average(CustomArray customArray) {
        int[] array = customArray.getArray();
        double average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        BigDecimal bigDecimal = new BigDecimal(average);
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public OptionalDouble averageStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).average();
    }

    @Override
    public int sum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public int sumStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).sum();
    }

    @Override
    public int negativeAmount(CustomArray customArray) {
        int[] array = customArray.getArray();
        int negativeAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeAmount++;
            }
        }
        return negativeAmount;
    }

    @Override
    public int negativeStream(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getArray()).filter(i -> i < 0).count();
    }

    @Override
    public int pozitiveAmount(CustomArray customArray) {
        int[] array = customArray.getArray();
        int pozitiveAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pozitiveAmount++;
            }
        }
        return pozitiveAmount;
    }

    @Override
    public int pozitiveStream(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getArray()).filter(i -> i > 0).count();
    }
}