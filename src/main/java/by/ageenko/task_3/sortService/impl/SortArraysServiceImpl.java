package by.ageenko.task_3.sortService.impl;

import by.ageenko.task_3.array.Array;
import by.ageenko.task_3.sortService.SortArraysService;



public class SortArraysServiceImpl implements SortArraysService {
    @Override
    public void bubbleSort(Array array) {
        boolean isSorted = false;
        int[] array1 = array.getArray();
        int buff = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    isSorted = false;
                    buff = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = buff;
                }
            }

        }
        array.setArray(array1);
    }

    @Override
    public void insertionSort(Array array) {
        int[] array1 = array.getArray();
        for (int i = 1; i < array1.length; i++) {
            int current = array1[i];
            int j = i - 1;
            while (j >= 0 && current < array1[j]) {
                array1[j + 1] = array1[j];
                j--;
            }
            array1[j + 1] = current;
        }
        array.setArray(array1);
    }

    @Override
    public void selectionSort(Array array) {
        int[] array1 = array.getArray();
        for (int i = 0; i < array1.length; i++) {
            int min = array1[i];
            int minId = i;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < min) {
                    min = array1[j];
                    minId = j;
                }
            }
            int temp = array1[i];
            array1[i] = min;
            array1[minId] = temp;
        }
        array.setArray(array1);
    }
}
