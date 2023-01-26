package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.OptionalInt;

public class IdSpecificationByMin implements Specification {
    private OptionalInt minValue;
    private ComparisonSign comparisonSign;

    public IdSpecificationByMin(OptionalInt minValue, ComparisonSign comparisonSign) {
        this.minValue = minValue;
        this.comparisonSign = comparisonSign;
    }

    @Override
    public boolean specify(CustomArray array) {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt min = arrayCalculationService.minStream(array);
        switch (comparisonSign){
            case LARGER -> {
                return min.getAsInt() > minValue.getAsInt();
            }
            case SMALLER -> {
                return min.getAsInt() < minValue.getAsInt();
            }
            case EQUALS -> {
                return min == minValue;
            }
        }
        return false;
    }
}
