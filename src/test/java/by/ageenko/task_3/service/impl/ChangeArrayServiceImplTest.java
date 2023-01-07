package by.ageenko.task_3.service.impl;

import by.ageenko.task_3.array.Array;
import by.ageenko.task_3.service.ChangeArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeArrayServiceImplTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void changeNegToPoz() {
        Array array = new Array();
        int[] array1 = {4, 5, 6, -1, 23, 5};
        array.setArray(array1);
        ChangeArrayServiceImpl changeArrayService = new ChangeArrayServiceImpl();
        int[] actual = changeArrayService.changeNegToPoz(array);
        int[] expected = {4, 5, 6, 1, 23, 5};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "changedArray = {}", actual);
    }

    @Test
    void changePozToNeg() {
        Array array = new Array();
        int[] array1 = {4, 5, 6, -1, 23, 5};
        array.setArray(array1);
        ChangeArrayServiceImpl changeArrayService = new ChangeArrayServiceImpl();
        int[] actual = changeArrayService.changePozToNeg(array);
        int[] expected = {-4, -5, -6, -1, -23, -5};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "changedArray = {}", actual);
    }
}