package by.ageenko.task_3.creator.impl;

import by.ageenko.task_3.creator.RepositoryCreator;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.repository.ArrayRepository;

import java.util.List;

public class RepositoryCreatorImpl implements RepositoryCreator {
    @Override
    public ArrayRepository createFromListObject(List<CustomArray> customArrays) {
        ArrayRepository arrayRepository = new ArrayRepository(customArrays);
        return arrayRepository;
    }

    @Override
    public ArrayRepository createFromListArray(List<int[]> arrays) {
        CustomArrayCreatorImpl customArrayCreator = new CustomArrayCreatorImpl();
        ArrayRepository arrayRepository = new ArrayRepository(customArrayCreator.createCustomArray(arrays));
        return arrayRepository;
    }
}
