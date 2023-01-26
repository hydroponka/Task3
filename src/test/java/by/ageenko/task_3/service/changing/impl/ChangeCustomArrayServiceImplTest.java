package by.ageenko.task_3.service.changing.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;
import by.ageenko.task_3.service.changing.MathemeticalSign;
import by.ageenko.task_3.service.changing.impl.ChangeArrayServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ChangeCustomArrayServiceImplTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void changeNegToPoz() throws CustomArrayException, IOException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//EmptyArray.txt");
        ChangeArrayServiceImpl changeArrayService = new ChangeArrayServiceImpl();
        int[] actual = changeArrayService.ChangeSignOfNumber(customArray, MathemeticalSign.POZITIVE);
        int[] expected = {};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "changedArray = {}", actual);
    }

    @Test
    void changePozToNeg() throws CustomArrayException {
        CustomArray customArray = new CustomArray();
        int[] array1 = {4, 5, 6, -1, 23, 5};
        customArray.setArray(array1);
        ChangeArrayServiceImpl changeArrayService = new ChangeArrayServiceImpl();
        int[] actual = changeArrayService.ChangeSignOfNumber(customArray, MathemeticalSign.NEGATIVE);
        int[] expected = {-4, -5, -6, -1, -23, -5};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "changedArray = {}", actual);
    }
}