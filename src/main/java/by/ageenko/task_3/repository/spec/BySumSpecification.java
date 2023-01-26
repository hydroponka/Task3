package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;

public class BySumSpecification implements Specification{
    private int sumValue;
    private ComparisonSign comparisonSign;

    public BySumSpecification(int sumValue, ComparisonSign comparisonSign) {
        this.sumValue = sumValue;
        this.comparisonSign = comparisonSign;
    }

    @Override
    public boolean specify(CustomArray array) {
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int sum = arrayCalculationService.sumStream(array);
        switch (comparisonSign){
            case LARGER -> {
                return sum > sumValue;
            }
            case SMALLER -> {
                return sum < sumValue;
            }
            case EQUALS -> {
                return sum == sumValue;
            }
        }
        return false;
    }
}
