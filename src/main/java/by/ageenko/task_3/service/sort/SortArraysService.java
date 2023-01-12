package by.ageenko.task_3.service.sort;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;

public interface SortArraysService {
    void bubbleSort(CustomArray customArray) throws CustomArrayException;
    void insertionSort(CustomArray customArray) throws CustomArrayException;
    void selectionSort(CustomArray customArray) throws CustomArrayException;
    void streamSort(CustomArray customArray) throws CustomArrayException;
}
