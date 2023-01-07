package by.ageenko.task_3.service.impl;

import by.ageenko.task_3.array.Array;
import by.ageenko.task_3.inputService.impl.InputServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCalculationServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    void min() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.min(array);
        int expected = -1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "min = {}", actual);
    }

    @Test
    void max() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.max(array);
        int expected = 43;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "max = {}", actual);
    }

    @Test
    void average() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        double actual = arrayCalculationService.average(array);
        double expected = 6.83;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "average = {}", actual);
    }

    @Test
    void sum() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.sum(array);
        int expected = 75;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void negativeAmount() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.negativeAmount(array);
        int expected = 1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "negativeAmount = {}", actual);
    }

    @Test
    void pozitiveAmount() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.pozitiveAmount(array);
        int expected = 5;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "pozitiveAmount = {}", actual);
    }

    @Test
    void minStream() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.minStream(array);
        OptionalInt expected = OptionalInt.of(-1);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "min = {}", actual);
    }

    @Test
    void maxStream() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.maxStream(array);
        OptionalInt expected = OptionalInt.of(43);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "max = {}", actual);
    }

    @Test
    void averageStream() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalDouble actual = arrayCalculationService.averageStream(array);
        OptionalDouble expected = OptionalDouble.of(12.50);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "average = {}", actual);
    }

    @Test
    void sumStream() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.sumStream(array);
        int expected = 75;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void negativeStream() {
        Array array = new Array();
        InputServiceImpl inputService = new InputServiceImpl();
        inputService.input(array, "D:/programming/Task3_Arrays/data/array.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.negativeStream(array);
        int expected = 1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void pozitiveStream() {
    }
}