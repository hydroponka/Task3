package by.ageenko.task_3.reader.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.ArrayReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;

public class ArrayReaderImpl implements ArrayReader {
    static Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//CorrectArrays.txt";
    private static final String SPACE_SEPARATOR = "\\s+";
    @Override
    public CustomArray reader(String filename) throws CustomArrayException {
        CustomArray customArray = new CustomArray();
        int[] array = {};
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file {} not exist", filename);
            filename = DEFAULT_FILENAME;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String strTemp = reader.readLine();
            if (strTemp != null){
                String[] strSplit = strTemp.split(SPACE_SEPARATOR);
                array = new int[strSplit.length];
                for (int i = 0; i < strSplit.length; i++) {
                    try {
                        array[i] = Integer.parseInt(strSplit[i]);
                    } catch (NumberFormatException e) {
                        logger.log(Level.ERROR, "Number format is incorrect = {}", strSplit[i]);
                    }
                }
                customArray.setArray(array);
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
                customArray.setArray(array);
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new CustomArrayException(e);
        }
        return customArray;
    }
}

