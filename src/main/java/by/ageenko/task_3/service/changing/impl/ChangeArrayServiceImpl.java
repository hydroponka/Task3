package by.ageenko.task_3.service.changing.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.changing.ChangeArrayService;

public class ChangeArrayServiceImpl implements ChangeArrayService {

    @Override
    public int[] changeNegToPoz(CustomArray customArray) {
        int[] array1 = customArray.getArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array1[i] = Math.abs(array1[i]);
            }
        }
        customArray.setArray(array1);
        return customArray.getArray();
    }

    @Override
    public int[] changePozToNeg(CustomArray customArray) {
        int[] array1 = customArray.getArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                array1[i] = (-1) * (array1[i]);
            }
        }
        customArray.setArray(array1);
        return customArray.getArray();
    }
}
