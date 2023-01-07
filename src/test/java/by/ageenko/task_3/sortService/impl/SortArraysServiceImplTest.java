package by.ageenko.task_3.sortService.impl;

import by.ageenko.task_3.array.Array;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArraysServiceImplTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void bubbleSort() {
        Array array = new Array();
        int[] array1 = {4, 5, 6, -1, 23, 5};
        array.setArray(array1);
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.bubbleSort(array);
        int[] actual = array.getArray();
        int[] expected = {-1, 4, 5, 5, 6, 23};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "sortBubble = {}", actual);
    }

    @Test
    void insertionSort() {
        Array array = new Array();
        int[] array1 = {4, 5, 6, -1, 23, 5};
        array.setArray(array1);
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.insertionSort(array);
        int[] actual = array.getArray();
        int[] expected = {-1, 4, 5, 5, 6, 23};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "insertionSort = {}", actual);
    }

    @Test
    void selectionSort() {
        Array array = new Array();
        int[] array1 = {4, 5, 6, -1, 23, 5};
        array.setArray(array1);
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.selectionSort(array);
        int[] actual = array.getArray();
        int[] expected = {-1, 4, 5, 5, 6, 23};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "selectionSort = {}", actual);
    }
}