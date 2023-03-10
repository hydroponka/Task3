package by.ageenko.task_3.service.sort.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SortArraysServiceImplTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void bubbleSort() throws CustomArrayException, IOException {
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
    void insertionSort() throws CustomArrayException, IOException {
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
    void selectionSort() throws CustomArrayException, IOException {
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
    void streamSort() throws CustomArrayException, IOException {
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