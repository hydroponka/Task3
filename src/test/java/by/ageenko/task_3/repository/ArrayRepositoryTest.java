package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.repository.spec.ByIdSpecification;
import by.ageenko.task_3.repository.spec.ByRangeSpecification;
import by.ageenko.task_3.repository.spec.BySumSpecification;
import by.ageenko.task_3.repository.spec.ComparisonSign;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class ArrayRepositoryTest {
static Logger logger = LogManager.getLogger();
    @Test
    void query() throws CustomArrayException, IOException {
        ArrayReaderImpl reader = new ArrayReaderImpl();
        List<CustomArray> customArrayList = reader.readerInList("data//IncorrectArray.txt");
        ArrayRepository arrayRepository = new ArrayRepository(customArrayList);
        ByIdSpecification byIdSpecification = new ByIdSpecification(2, ComparisonSign.LARGER);
        logger.log(Level.INFO,arrayRepository.query(byIdSpecification));
        ByRangeSpecification byRangeSpecification = new ByRangeSpecification(1,2);
        logger.log(Level.INFO,arrayRepository.query(byRangeSpecification));
        BySumSpecification bySumSpecification = new BySumSpecification(200, ComparisonSign.LARGER);
        logger.log(Level.INFO,arrayRepository.query(bySumSpecification));
    }
    @Test
    void addArray() throws CustomArrayException, IOException {
        ArrayReaderImpl reader = new ArrayReaderImpl();
        List<CustomArray> customArrayList = reader.readerInList("data//IncorrectArray.txt");
        ArrayRepository arrayRepository = new ArrayRepository(customArrayList);
        //System.out.println(arrayRepository);
        //System.out.println(arrayRepository);
    }

    @Test
    void updateArray() throws CustomArrayException, IOException {
        ArrayReaderImpl reader = new ArrayReaderImpl();
        List<CustomArray> customArrayList = reader.readerInList("data//IncorrectArray.txt");
        ArrayRepository arrayRepository = new ArrayRepository(customArrayList);
        logger.log(Level.INFO,arrayRepository);
        CustomArray customArray = reader.reader("data//CorrectArray.txt");
        arrayRepository.updateArray(2,customArray);
        logger.log(Level.INFO,arrayRepository);
    }

}