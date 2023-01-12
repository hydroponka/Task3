package by.ageenko.task_3.service.calculation.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.service.calculation.ArrayCalculationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {
    static Logger logger = LogManager.getLogger();

    @Override
    public OptionalInt min(CustomArray customArray) throws CustomArrayException {
        int[] array = customArray.getArray();
        OptionalInt min;
        if (array == null) {
            throw new CustomArrayException("Array is empty");
        } else if (array.length != 0) {
            int minTemp = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minTemp) {
                    minTemp = array[i];
                }
            }
            min = OptionalInt.of(minTemp);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
            return OptionalInt.empty();
        }
        return min;
    }

    @Override
    public OptionalInt minStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).min();
    }

    @Override
    public OptionalInt max(CustomArray customArray) throws CustomArrayException {
        int[] array = customArray.getArray();
        OptionalInt max;
        if (array == null) {
            throw new CustomArrayException("Array is empty");
        } else if (array.length != 0) {
            int maxTemp = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxTemp) {
                    maxTemp = array[i];
                }
            }
            max = OptionalInt.of(maxTemp);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
            return OptionalInt.empty();
        }
        return max;
    }

    @Override
    public OptionalInt maxStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).max();
    }

    @Override
    public OptionalDouble average(CustomArray customArray) throws CustomArrayException {
        int[] array = customArray.getArray();
        OptionalDouble average;
        int sum = 0;
        if (array == null) {
            throw new CustomArrayException("Array is empty");
        } else if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = OptionalDouble.of((double) sum / array.length);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
            return OptionalDouble.empty();
        }
        return average;
    }

    @Override
    public OptionalDouble averageStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).average();
    }

    @Override
    public OptionalInt sum(CustomArray customArray) throws CustomArrayException {
        int[] array = customArray.getArray();
        OptionalInt sum;
        if (array == null) {
            throw new CustomArrayException("Array is empty");
        } else if (array.length != 0) {
            int sumTemp = 0;
            for (int i = 0; i < array.length; i++) {
                sumTemp += array[i];
            }
            sum = OptionalInt.of(sumTemp);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
            return OptionalInt.empty();
        }
        return sum;
    }

    @Override
    public int sumStream(CustomArray customArray) {
        return Arrays.stream(customArray.getArray()).sum();
    }

    @Override
    public OptionalInt negativeAmount(CustomArray customArray) throws CustomArrayException {
        int[] array = customArray.getArray();
        OptionalInt negativeAmount;
        if (array == null) {
            throw new CustomArrayException("Array is empty");}
        else if (array.length != 0) {
            int negativeAmountTemp = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    negativeAmountTemp++;
                }
            }
            negativeAmount = OptionalInt.of(negativeAmountTemp);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
            return OptionalInt.empty();
        }
        return negativeAmount;
    }

    @Override
    public int negativeStream(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getArray()).filter(i -> i < 0).count();
    }

    @Override
    public OptionalInt pozitiveAmount(CustomArray customArray) throws CustomArrayException {
        int[] array = customArray.getArray();
        OptionalInt pozitiveAmount;
        if (array == null) {
            throw new CustomArrayException("Array is empty");}
        else if (array.length != 0) {
            int pozitiveAmountTemp = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    pozitiveAmountTemp++;
                }
            }
            pozitiveAmount = OptionalInt.of(pozitiveAmountTemp);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
            return OptionalInt.empty();
        }
        return pozitiveAmount;
    }

    @Override
    public int pozitiveStream(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getArray()).filter(i -> i > 0).count();
    }
}