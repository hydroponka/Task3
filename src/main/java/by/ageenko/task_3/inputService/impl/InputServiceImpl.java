package by.ageenko.task_3.inputService.impl;

import by.ageenko.task_3.array.Array;
import by.ageenko.task_3.inputService.InputService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InputServiceImpl implements InputService {

    @Override
    public void input(Array array, String file) {
        try {
            FileReader fr = new FileReader(file);
            Scanner scan = new Scanner(fr);
            String s = scan.nextLine();
            String[] arr = s.split(" ");
            int[] arr1 = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = Integer.parseInt(arr[i]);
            }
            fr.close();
            array.setArray(arr1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
