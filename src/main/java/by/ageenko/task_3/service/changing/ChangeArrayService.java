package by.ageenko.task_3.service.changing;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;

import java.util.Optional;
import java.util.OptionalInt;

public interface ChangeArrayService {
    int[] ChangeSignOfNumber(CustomArray customArray, MathemeticalSign mathemeticalSign) throws CustomArrayException;
}
