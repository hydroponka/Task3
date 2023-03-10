package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.OptionalInt;

public class ByMaxSpecification implements Specification {
    private OptionalInt maxValue;
    private ComparisonSign comparisonSign;

    public ByMaxSpecification(OptionalInt maxValue, ComparisonSign comparisonSign) {
        this.maxValue = maxValue;
        this.comparisonSign = comparisonSign;
    }

    @Override
    public boolean specify(CustomArray array) {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt max = arrayCalculationService.maxStream(array);
        switch (comparisonSign){
            case LARGER -> {
                return max.getAsInt() > maxValue.getAsInt();
            }
            case SMALLER -> {
                return max.getAsInt() < maxValue.getAsInt();
            }
            case EQUALS -> {
                return max == maxValue;
            }
        }
        return false;
    }
}
