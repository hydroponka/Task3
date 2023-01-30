package by.ageenko.task_3.creator.impl;

import by.ageenko.task_3.creator.CustomArrayCreator;
import by.ageenko.task_3.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreatorImpl implements CustomArrayCreator {
    @Override
    public CustomArray createCustomArray(int[] array) {
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }

    @Override
    public List<CustomArray> createCustomArray(List<int[]> arrayList) {
        List<CustomArray> customArrayList = new ArrayList<>();
        for (int i = 0; i<arrayList.size(); i++){
            customArrayList.add(new CustomArray(arrayList.get(i)));
        }
        return customArrayList;
    }
}
