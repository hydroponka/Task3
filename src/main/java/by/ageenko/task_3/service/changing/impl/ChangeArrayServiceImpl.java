package by.ageenko.task_3.service.changing.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.service.changing.ChangeArrayService;
import by.ageenko.task_3.service.changing.MathemeticalSign;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeArrayServiceImpl implements ChangeArrayService {
    static Logger logger = LogManager.getLogger();
    @Override
    public int[] ChangeSignOfNumber(CustomArray customArray, MathemeticalSign mathemeticalSign) throws CustomArrayException {
        int[] array = customArray.getArray();
        if (array == null) {
            throw new CustomArrayException("Array is empty");
        } else if (array.length != 0) {
            if (mathemeticalSign.equals(MathemeticalSign.POZITIVE)) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        array[i] = Math.abs(array[i]);
                    }
                }
            }
            if (mathemeticalSign.equals(MathemeticalSign.NEGATIVE)) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > 0) {
                        array[i] = MathemeticalSign.NEGATIVE.getValue() * (array[i]);
                    }
                }
            }
            customArray.setArray(array);
        } else {
            logger.log(Level.INFO, "Array length = 0", array);
        }
        return customArray.getArray();
    }
}
