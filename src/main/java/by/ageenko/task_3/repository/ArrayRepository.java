package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.reader.impl.ArrayReaderImpl;
import by.ageenko.task_3.repository.spec.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayRepository {
    private List<CustomArray> customArrays;

    public ArrayRepository(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }

    public void setCustomArrays(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> results = new ArrayList<>();
        for (CustomArray array : customArrays) {
            if (specification.specify(array)) {
                results.add(array);
            }
        }
        return results;
    }

    public void deleteArray(int id) {
        for (int i = 0; i < customArrays.size(); i++) {
            if (customArrays.get(i).getArrayId() == id)
                customArrays.remove(i);
        }
    }
    public void addArray(String filename) throws CustomArrayException {
        ArrayReaderImpl arrayReader = new ArrayReaderImpl();
        List<CustomArray> results = arrayReader.readerInList(filename);
        for (CustomArray array : results){
            customArrays.add(array);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("customArrays=" + customArrays)
                .toString();
    }
}
