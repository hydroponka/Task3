package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;

public class ByIdSpecification implements Specification {
    private int id;
    private ComparisonSign comparisonSign;

    public ByIdSpecification(int id, ComparisonSign comparisonSign) {
        this.id = id;
        this.comparisonSign = comparisonSign;
    }

    @Override
    public boolean specify(CustomArray array) {
        switch (comparisonSign) {
            case LARGER -> {
                return array.getArrayId() > id;
            }
            case SMALLER -> {
                return array.getArrayId() < id;
            }
            case EQUALS -> {
                return array.getArrayId() == id;
            }
        }
        return false;
    }
}
