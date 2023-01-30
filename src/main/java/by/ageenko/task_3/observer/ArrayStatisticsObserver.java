package by.ageenko.task_3.observer;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;

public interface ArrayStatisticsObserver {
    void changeArrayElement(CustomArray customArray) throws CustomArrayException;
}
