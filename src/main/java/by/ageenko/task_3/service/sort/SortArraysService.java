package by.ageenko.task_3.service.sort;

import by.ageenko.task_3.entity.CustomArray;

public interface SortArraysService {
    void bubbleSort(CustomArray customArray);
    void insertionSort(CustomArray customArray);
    void selectionSort(CustomArray customArray);
    void streamSort(CustomArray customArray);
}
