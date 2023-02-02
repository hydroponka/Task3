package by.ageenko.task_3.creator.impl;

import by.ageenko.task_3.creator.RepositoryCreator;
import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.repository.ArrayRepository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCreatorImpl implements RepositoryCreator {
    @Override
    public ArrayRepository createFromListObject(List<CustomArray> customArrays) {
        ArrayRepository arrayRepository = new ArrayRepository(customArrays);
        return arrayRepository;
    }

    @Override
    public ArrayRepository createFromListArray(List<int[]> arrays) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int[] i : arrays){
            customArrayList.add(new CustomArray(i));
        }
        ArrayRepository arrayRepository = new ArrayRepository(customArrayList);
        return arrayRepository;
    }
}
