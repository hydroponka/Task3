package by.ageenko.task_3.reader.impl;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.ArrayReader;
import by.ageenko.task_3.validator.impl.StringArrayValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayReaderImpl implements ArrayReader {
    static Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//CorrectArrays.txt";
    private static final String SPACE_SEPARATOR = "\\s+";
    @Override
    public CustomArray reader(String filename) throws CustomArrayException, IOException {
        CustomArray customArray = new CustomArray();
        StringArrayValidatorImpl validator = new StringArrayValidatorImpl();
        int[] arrayTemp;
        int[] array = {};
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file {} not exist", filename);
            filename = DEFAULT_FILENAME;
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String strTemp = reader.readLine();
            if (strTemp != null){
                String[] strSplit = strTemp.split(SPACE_SEPARATOR);
                arrayTemp = new int[strSplit.length];
                int counter = 0;
                for (int i = 0; i < strSplit.length; i++) {
                    if (validator.stringNumberValidate(strSplit[i])){
                        arrayTemp[counter] = Integer.parseInt(strSplit[i]);
                        counter++;
                    }
                }
                array = Arrays.copyOfRange(arrayTemp, 0, counter);
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
            }
            customArray.setArray(array);
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new CustomArrayException(e);
        }finally {
            reader.close();
        }
        return customArray;
    }

    @Override
    public List<CustomArray> readerInList(String filename) throws CustomArrayException, IOException {
        List<CustomArray> customArrayList = new ArrayList<>();
        StringArrayValidatorImpl validator = new StringArrayValidatorImpl();
        int[] arrayTemp;
        int[] array;
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file {} not exist", filename);
            filename = DEFAULT_FILENAME;
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String strTemp = reader.readLine();
            if (strTemp == null) {
                customArrayList.add(new CustomArray());
                logger.log(Level.WARN, "File is empty = {}", filename); //or throw new CustomArrayException("File is empty")?
            } else {
                while (strTemp != null) {
                    String[] strSplit = strTemp.split(SPACE_SEPARATOR);
                    arrayTemp = new int[strSplit.length];
                    int counter = 0;
                    for (int i = 0; i < strSplit.length; i++) {
                        if (validator.stringNumberValidate(strSplit[i])) {
                            arrayTemp[counter] = Integer.parseInt(strSplit[i]);
                            counter++;
                        }
                    }
                    array = Arrays.copyOfRange(arrayTemp, 0, counter);
                    customArrayList.add(new CustomArray(array));
                    strTemp = reader.readLine();
                }
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new CustomArrayException(e);
        }finally {
            reader.close();
        }
        return customArrayList;
    }
}

