package by.ageenko.task_3.repository.spec;

import by.ageenko.task_3.entity.CustomArray;

public class IdSpecificationById implements Specification{
    private int id;

    public IdSpecificationById(int id) {
        this.id = id;
    }
    @Override
    public boolean specify(CustomArray array) {
        return array.getArrayId() == id;
    }
}
