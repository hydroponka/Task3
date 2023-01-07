package by.ageenko.task_3.service;

import by.ageenko.task_3.array.Array;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ArrayCalculationService {
    int min(Array array);
    OptionalInt minStream(Array array);
    int max(Array array);
    OptionalInt maxStream(Array array);
    double average(Array array);
    OptionalDouble averageStream(Array array);
    int sum(Array array);
    int sumStream(Array array);
    int negativeAmount(Array array);
    int negativeStream(Array array);
    int pozitiveAmount(Array array);
    int pozitiveStream(Array array);
}
