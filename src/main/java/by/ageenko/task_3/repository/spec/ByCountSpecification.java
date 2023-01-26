package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;

public class ByCountSpecification implements Specification{
    private int memberCount;

    public ByCountSpecification(int memberCount) {
        this.memberCount = memberCount;
    }

    @Override
    public boolean specify(CustomArray array) {
        return array.getArray().length == memberCount;
    }
}
