package by.ageenko.task_3.main;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.entity.Warehouse;
import by.ageenko.task_3.repository.ArrayRepository;
import by.ageenko.task_3.repository.sort.ByCountSort;
import by.ageenko.task_3.repository.sort.ByFirstElementSort;
import by.ageenko.task_3.repository.sort.ByIdSort;
import org.apache.logging.log4j.util.PropertySource;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomArrayException, IOException {
        ArrayReaderImpl readerArray = new ArrayReaderImpl();
        List<CustomArray> customArrayList = readerArray.readerInList("data//IncorrectArray.txt");
        customArrayList.get(0).setArrayId(3);
        customArrayList.get(1).setArrayId(2);
        customArrayList.get(2).setArrayId(4);
        customArrayList.get(3).setArrayId(6);
        customArrayList.get(4).setArrayId(1);
        customArrayList.get(5).setArrayId(5);
        ArrayRepository arrayRepository = new ArrayRepository(customArrayList);
        System.out.println(arrayRepository);
        /*System.out.println(Warehouse.getInstance().getSummaryStatistics());
        arrayRepository.deleteArray(1);
        System.out.println(arrayRepository);
        System.out.println(Warehouse.getInstance().getSummaryStatistics());*/

        ByCountSort byCountSort = new ByCountSort();
        System.out.println(arrayRepository.sort(byCountSort));
        System.out.println(arrayRepository.reversSort(byCountSort));
        System.out.println(arrayRepository.getCustomArrays());


    }
}
