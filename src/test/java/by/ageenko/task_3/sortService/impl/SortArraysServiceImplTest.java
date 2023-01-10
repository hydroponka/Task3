package by.ageenko.task_3.sortService.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.service.sort.impl.SortArraysServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArraysServiceImplTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void bubbleSort() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//EmptyArray.txt");
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.bubbleSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {0};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "sortBubble = {}", actual);
    }

    @Test
    void insertionSort() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.insertionSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {-1, 0, 0, 4, 23, 43};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "insertionSort = {}", actual);
    }

    @Test
    void selectionSort() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//CorrectArray.txt");
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.selectionSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {2, 4, 5, 6, 43};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "selectionSort = {}", actual);
    }

    @Test
    void streamSort(){
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//CorrectArray.txt");
        SortArraysServiceImpl sortArraysService = new SortArraysServiceImpl();
        sortArraysService.streamSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {2, 4, 5, 6, 43};
        assertArrayEquals(expected, actual);
        logger.log(Level.INFO, "selectionSort = {}", actual);
    }
}