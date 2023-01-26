package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class WareHouse {
    private OptionalDouble average;
    private OptionalInt sum;
    private OptionalInt max;
    private OptionalInt min;

    public WareHouse(CustomArray array) throws CustomArrayException {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        this.average = arrayCalculationService.average(array);
        this.sum = arrayCalculationService.sum(array);
        this.max = arrayCalculationService.max(array);
        this.min = arrayCalculationService.min(array);
    }
}
