package by.ageenko.task_3.service.sort.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.service.sort.SortArraysService;

import java.util.Arrays;


public class SortArraysServiceImpl implements SortArraysService {
    @Override
    public void bubbleSort(CustomArray customArray) {
        boolean isSorted = false;
        int[] array = customArray.getArray();
        int buff = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }

        }
        customArray.setArray(array);
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        customArray.setArray(array);
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        customArray.setArray(array);
    }

    @Override
    public void streamSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        customArray.setArray(Arrays.stream(array).sorted().toArray());
    }
}
