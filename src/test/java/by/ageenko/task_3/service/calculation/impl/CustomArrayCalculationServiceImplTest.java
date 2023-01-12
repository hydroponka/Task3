package by.ageenko.task_3.service.calculation.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.service.calculation.impl.ArrayCalculationServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


import java.util.OptionalDouble;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayCalculationServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    void min() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.min(customArray);
        int expected = -1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "min = {}", actual);
    }

    @Test
    void max() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.max(customArray);
        int expected = 43;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "max = {}", actual);
    }

    @Test
    void average() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        double actual = arrayCalculationService.average(customArray);
        double expected = 6.83;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "average = {}", actual);
    }

    @Test
    void sum() {

        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.sum(customArray);
        int expected = 75;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void negativeAmount() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.negativeAmount(customArray);
        int expected = 1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "negativeAmount = {}", actual);
    }

    @Test
    void pozitiveAmount() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.pozitiveAmount(customArray);
        int expected = 5;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "pozitiveAmount = {}", actual);
    }

    @Test
    void minStream() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.minStream(customArray);
        OptionalInt expected = OptionalInt.of(-1);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "min = {}", actual);
    }

    @Test
    void maxStream() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.maxStream(customArray);
        OptionalInt expected = OptionalInt.of(43);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "max = {}", actual);
    }

    @Test
    void averageStream() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalDouble actual = arrayCalculationService.averageStream(customArray);
        OptionalDouble expected = OptionalDouble.of(12.50);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "average = {}", actual);
    }

    @Test
    void sumStream() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.sumStream(customArray);
        int expected = 75;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void negativeStream() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.negativeStream(customArray);
        int expected = 1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "amount = {}", actual);
    }

    @Test
    void pozitiveStream() {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//CorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.pozitiveStream(customArray);
        int expected = 5;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "amount = {}", actual);
    }
}