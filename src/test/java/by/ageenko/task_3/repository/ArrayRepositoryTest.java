package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.repository.spec.IdSpecificationById;
import by.ageenko.task_3.repository.spec.IdSpecificationByRange;
import by.ageenko.task_3.repository.spec.IdSpecificationBySum;
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
        IdSpecificationById idSpecificationById = new IdSpecificationById(2, ComparisonSign.LARGER);
        logger.log(Level.INFO,arrayRepository.query(idSpecificationById));
        IdSpecificationByRange idSpecificationByRange = new IdSpecificationByRange(1,2);
        logger.log(Level.INFO,arrayRepository.query(idSpecificationByRange));
        IdSpecificationBySum idSpecificationBySum = new IdSpecificationBySum(200, ComparisonSign.LARGER);
        logger.log(Level.INFO,arrayRepository.query(idSpecificationBySum));
    }
    @Test
    void addArray() throws CustomArrayException, IOException {
        ArrayReaderImpl reader = new ArrayReaderImpl();
        List<CustomArray> customArrayList = reader.readerInList("data//IncorrectArray.txt");
        ArrayRepository arrayRepository = new ArrayRepository(customArrayList);
        System.out.println(arrayRepository);
        arrayRepository.addArray("data//IncorrectArray.txt");
        System.out.println(arrayRepository);
    }

}