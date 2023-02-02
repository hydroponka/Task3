package by.ageenko.task_3.creator.impl;

import by.ageenko.task_3.creator.RepositoryCreator;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.repository.ArrayRepository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCreatorImpl implements RepositoryCreator {
    @Override
    public ArrayRepository createFromListObject(List<CustomArray> customArrays) {
        return new ArrayRepository(customArrays);
    }

    @Override
    public ArrayRepository createFromListArray(List<int[]> arrays) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] i : arrays){
            customArrayList.add(new CustomArray(i));
        }
        return new ArrayRepository(customArrayList);
    }
}
