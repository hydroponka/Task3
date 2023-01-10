package by.ageenko.task_3.reader.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.reader.ArrayReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ArrayReaderImpl implements ArrayReader {
    static Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//arrays.txt";
    @Override
    public CustomArray reader(String filename) {
        CustomArray customArray = new CustomArray();
        int[] arr = null;
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file " + filename + " not exist");
            filename = DEFAULT_FILENAME;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            Scanner scan = new Scanner(reader);
            String arrTemp = scan.nextLine();
            String[] arrSplit = arrTemp.split("\\s+");
            arr = new int[arrSplit.length];
            for (int i = 0; i < arrSplit.length; i++) {
                try {
                    arr[i] = Integer.parseInt(arrSplit[i]);
                } catch (Exception e) {
                    logger.log(Level.ERROR, e);
                    arrSplit[i] = "0";
                    arr[i] = Integer.parseInt(arrSplit[i]);
                }
            }
            customArray.setArray(arr);
        } catch (Exception e) {
            logger.log(Level.ERROR, e);
            arr = new int[]{0};
            customArray.setArray(arr);
        }
        return customArray;
    }
}

