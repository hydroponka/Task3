package by.ageenko.task_3.service.changing.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.changing.ChangeArrayService;
import by.ageenko.task_3.service.changing.MathemeticalSign;

public class ChangeArrayServiceImpl implements ChangeArrayService {

    @Override
    public int[] ChangeSignOfNumber(CustomArray customArray, MathemeticalSign mathemeticalSign) {
        int[] array1 = customArray.getArray();
        if (mathemeticalSign.equals(MathemeticalSign.POZITIVE)) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] < 0) {
                    array1[i] = Math.abs(array1[i]);
                }
            }
        }
        if (mathemeticalSign.equals(MathemeticalSign.NEGATIVE)) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] > 0) {
                    array1[i] = MathemeticalSign.NEGATIVE.getValue() * (array1[i]);
                }
            }
        }
        customArray.setArray(array1);
        return customArray.getArray();
    }
}
