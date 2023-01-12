package by.ageenko.task_3.service.calculation.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
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
    void min() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//CorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.min(customArray);
        OptionalInt expected = OptionalInt.of(2);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "min = {}", actual);
    }
    @Test
    void max() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.max(customArray);
        OptionalInt expected = OptionalInt.of(43);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "max = {}", actual);
    }
    @Test
    void average() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalDouble actual = arrayCalculationService.average(customArray);
        OptionalDouble expected = OptionalDouble.of(6.83);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "average = {}", actual);
    }

    @Test
    void sum() throws CustomArrayException {

        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.sum(customArray);
        OptionalInt expected = OptionalInt.of(69);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void negativeAmount() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.negativeAmount(customArray);
        OptionalInt expected = OptionalInt.of(1);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "negativeAmount = {}", actual);
    }

    @Test
    void pozitiveAmount() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.pozitiveAmount(customArray);
        OptionalInt expected = OptionalInt.of(5);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "pozitiveAmount = {}", actual);
    }

    @Test
    void minStream() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.minStream(customArray);
        OptionalInt expected = OptionalInt.of(-1);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "min = {}", actual);
    }

    @Test
    void maxStream() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalInt actual = arrayCalculationService.maxStream(customArray);
        OptionalInt expected = OptionalInt.of(43);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "max = {}", actual);
    }

    @Test
    void averageStream() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        OptionalDouble actual = arrayCalculationService.averageStream(customArray);
        OptionalDouble expected = OptionalDouble.of(12.50);
        assertEquals(expected, actual);
        logger.log(Level.INFO, "average = {}", actual);
    }

    @Test
    void sumStream() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.sumStream(customArray);
        int expected = 75;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "sum = {}", actual);
    }

    @Test
    void negativeStream() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//IncorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.negativeStream(customArray);
        int expected = 1;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "amount = {}", actual);
    }

    @Test
    void pozitiveStream() throws CustomArrayException {
        ArrayReaderImpl inputService = new ArrayReaderImpl();
        CustomArray customArray = inputService.reader("data//CorrectArray.txt");
        ArrayCalculationServiceImpl arrayCalculationService = new ArrayCalculationServiceImpl();
        int actual = arrayCalculationService.pozitiveStream(customArray);
        int expected = 5;
        assertEquals(expected, actual);
        logger.log(Level.INFO, "amount = {}", actual);
    }
}