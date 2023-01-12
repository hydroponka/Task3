package by.ageenko.task_3.service.calculation;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayCalculationService {
    OptionalInt min(CustomArray customArray) throws CustomArrayException;
    OptionalInt minStream(CustomArray customArray);
    OptionalInt max(CustomArray customArray) throws CustomArrayException;
    OptionalInt maxStream(CustomArray customArray);
    OptionalDouble average(CustomArray customArray) throws CustomArrayException;
    OptionalDouble averageStream(CustomArray customArray);
    OptionalInt sum(CustomArray customArray) throws CustomArrayException;
    int sumStream(CustomArray customArray);
    OptionalInt negativeAmount(CustomArray customArray) throws CustomArrayException;
    int negativeStream(CustomArray customArray);
    OptionalInt pozitiveAmount(CustomArray customArray) throws CustomArrayException;
    int pozitiveStream(CustomArray customArray);
}
