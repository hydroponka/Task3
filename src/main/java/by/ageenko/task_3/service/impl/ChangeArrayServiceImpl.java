package by.ageenko.task_3.service.impl;

import by.ageenko.task_3.array.Array;
import by.ageenko.task_3.service.ChangeArrayService;

public class ChangeArrayServiceImpl implements ChangeArrayService {

    @Override
    public int[] changeNegToPoz(Array array) {
        int[] array1 = array.getArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array1[i] = Math.abs(array1[i]);
            }
        }
        array.setArray(array1);
        return array.getArray();
    }

    @Override
    public int[] changePozToNeg(Array array) {
        int[] array1 = array.getArray();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                array1[i] = (-1) * (array1[i]);
            }
        }
        array.setArray(array1);
        return array.getArray();
    }
}
