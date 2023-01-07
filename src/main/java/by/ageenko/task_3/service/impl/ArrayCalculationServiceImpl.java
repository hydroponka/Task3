package by.ageenko.task_3.service.impl;

import by.ageenko.task_3.array.Array;
import by.ageenko.task_3.service.ArrayCalculationService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {

    @Override
    public int min(Array array) {
        int[] array1 = array.getArray();
        int min = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }

    @Override
    public OptionalInt minStream(Array array) {
        return Arrays.stream(array.getArray()).min();
    }

    @Override
    public int max(Array array) {
        int[] array1 = array.getArray();
        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }

    @Override
    public OptionalInt maxStream(Array array) {
        return Arrays.stream(array.getArray()).max();
    }

    @Override
    public double average(Array array) {
        int[] array1 = array.getArray();
        double average = 0;
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        average = sum / array1.length;
        BigDecimal bigDecimal = new BigDecimal(average);
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public OptionalDouble averageStream(Array array) {
        return Arrays.stream(array.getArray()).average();
    }

    @Override
    public int sum(Array array) {
        int[] array1 = array.getArray();
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        return sum;
    }

    @Override
    public int sumStream(Array array) {
        return Arrays.stream(array.getArray()).sum();
    }

    @Override
    public int negativeAmount(Array array) {
        int[] array1 = array.getArray();
        int negativeAmount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                negativeAmount++;
            }
        }
        return negativeAmount;
    }

    @Override
    public int negativeStream(Array array) {
        return 0;
    }

    @Override
    public int pozitiveAmount(Array array) {
        int[] array1 = array.getArray();
        int pozitiveAmount = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                pozitiveAmount++;
            }
        }
        return pozitiveAmount;
    }

    @Override
    public int pozitiveStream(Array array) {
        return 0;
    }
}