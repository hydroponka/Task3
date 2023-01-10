package by.ageenko.task_3.service.calculation;

import by.ageenko.task_3.entity.CustomArray;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayCalculationService {
    int min(CustomArray customArray);
    OptionalInt minStream(CustomArray customArray);
    int max(CustomArray customArray);
    OptionalInt maxStream(CustomArray customArray);
    double average(CustomArray customArray);
    OptionalDouble averageStream(CustomArray customArray);
    int sum(CustomArray customArray);
    int sumStream(CustomArray customArray);
    int negativeAmount(CustomArray customArray);
    int negativeStream(CustomArray customArray);
    int pozitiveAmount(CustomArray customArray);
    int pozitiveStream(CustomArray customArray);
}
