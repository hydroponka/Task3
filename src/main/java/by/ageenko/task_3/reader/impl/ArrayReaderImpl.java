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
    private static final String DEFAULT_FILENAME = "data//CorrectArrays.txt";
    @Override
    public CustomArray reader(String filename) {
        CustomArray customArray = new CustomArray();
        int[] array = null;
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file " + filename + " not exist");
            filename = DEFAULT_FILENAME;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            Scanner scan = new Scanner(reader);
            String arrayTemp = scan.nextLine();
            String[] arraySplit = arrayTemp.split("\\s+");
            array = new int[arraySplit.length];
            for (int i = 0; i < arraySplit.length; i++) {
                try {
                    array[i] = Integer.parseInt(arraySplit[i]);
                } catch (NumberFormatException e) {
                    logger.log(Level.ERROR, "Number format is incorrect = {}",arraySplit[i]);
                    arraySplit[i] = "0";
                    array[i] = Integer.parseInt(arraySplit[i]);
                }
            }
            customArray.setArray(array);
        } catch (Exception e) {
            logger.log(Level.ERROR, "File is empty = {}", filename);
            array = new int[]{0};
            customArray.setArray(array);
        }
        return customArray;
    }
}

