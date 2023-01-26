package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.*;

public class Warehouse {
    private ArrayList calculationArray = new ArrayList<>();

    public Warehouse(List<CustomArray> customArrays) throws CustomArrayException {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        for (int i = 0; i< customArrays.size(); i++){
            calculationArray.add(customArrays.get(i).getArrayId());
            calculationArray.add(arrayCalculationService.sum(customArrays.get(i)));
            calculationArray.add(arrayCalculationService.average(customArrays.get(i)));
            calculationArray.add(arrayCalculationService.max(customArrays.get(i)));
            calculationArray.add(arrayCalculationService.min(customArrays.get(i)));
        }
    }

    public ArrayList getCalculationArray() {
        return calculationArray;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("calculationArray=" + calculationArray)
                .toString();
    }
}
