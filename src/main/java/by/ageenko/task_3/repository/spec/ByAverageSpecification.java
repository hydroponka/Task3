package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

import java.util.OptionalDouble;

public class ByAverageSpecification implements Specification {
    private OptionalDouble averageValue;
    private ComparisonSign comparisonSign;

    public ByAverageSpecification(OptionalDouble averageValue, ComparisonSign comparisonSign) {
        this.averageValue = averageValue;
        this.comparisonSign = comparisonSign;
    }

    @Override
    public boolean specify(CustomArray array) {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalDouble average = arrayCalculationService.averageStream(array);
        switch (comparisonSign){
            case LARGER -> {
                return average.getAsDouble() > averageValue.getAsDouble();
            }
            case SMALLER -> {
                return average.getAsDouble() < averageValue.getAsDouble();
            }
            case EQUALS -> {
                return average == averageValue;
            }
        }
        return false;
    }
}
