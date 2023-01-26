package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.*;

public class Warehouse {
    private ArrayList calculationArray = new ArrayList<>();
    private ArrayList id = new ArrayList<>();
    private ArrayList sum = new ArrayList<>();
    private ArrayList average = new ArrayList<>();
    private ArrayList max = new ArrayList<>();
    private ArrayList min = new ArrayList<>();

    public Warehouse(List<CustomArray> customArrays) throws CustomArrayException {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        for (int i = 0; i < customArrays.size(); i++) {
            this.id.add(customArrays.get(i).getArrayId());
            this.sum.add(arrayCalculationService.sum(customArrays.get(i)));
            this.average.add(arrayCalculationService.average(customArrays.get(i)));
            this.max.add(arrayCalculationService.max(customArrays.get(i)));
            this.min.add(arrayCalculationService.min(customArrays.get(i)));
        }
        for (int i = 0; i< customArrays.size(); i++){
            calculationArray.add(id.get(i));
            calculationArray.add(sum.get(i));
            calculationArray.add(average.get(i));
            calculationArray.add(max.get(i));
            calculationArray.add(min.get(i));
        }
    }

    public ArrayList getCalculationArray() {
        return calculationArray;
    }

    public ArrayList getId() {
        return id;
    }

    public ArrayList getSum() {
        return sum;
    }

    public ArrayList getAverage() {
        return average;
    }

    public ArrayList getMax() {
        return max;
    }

    public ArrayList getMin() {
        return min;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("calculationArray=" + calculationArray)
                .toString();
    }
}
