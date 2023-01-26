package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;

public class IdSpecificationByRange implements Specification{
    private int leftEnd;
    private int rightEnd;

    public IdSpecificationByRange(int leftEnd, int rightEnd) {
        this.leftEnd = leftEnd;
        this.rightEnd = rightEnd;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getArrayId() >= leftEnd && array.getArrayId() <= rightEnd;
    }
}
