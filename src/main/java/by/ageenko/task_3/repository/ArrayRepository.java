package by.ageenko.task_3.repository;

import by.ageenko.task_3.entity.CustomArray;
import by.ageenko.task_3.entity.Warehouse;
import by.ageenko.task_3.repository.spec.Specification;

import java.util.*;

public class ArrayRepository {
    private List<CustomArray> customArrays;

    public ArrayRepository(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
        Warehouse.getInstance().calculateSummaryStatistics(customArrays);
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }

    public void setCustomArrays(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
        Warehouse.getInstance().calculateSummaryStatistics(customArrays);
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
        Warehouse.getInstance().calculateSummaryStatistics(customArrays);
    }

    public void addArray(CustomArray customArray) {
        customArrays.add(customArray);
        Warehouse.getInstance().calculateSummaryStatistics(customArrays);
    }

    public void updateArray(int id, CustomArray customArray) {
        for (int i = 0; i < customArrays.size(); i++) {
            if (customArrays.get(i).getArrayId() == id) {
                customArrays.remove(i);
                customArrays.add(i, customArray);
                customArray.setArrayId(id);
            }
        }
        Warehouse.getInstance().calculateSummaryStatistics(customArrays);
    }

    public List<CustomArray> sort(Comparator comparator) {
        Collections.sort(customArrays, comparator);
        return customArrays;
    }

    public List<CustomArray> reversSort(Comparator comparator) {
        Collections.sort(customArrays, comparator.reversed());
        return customArrays;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("customArrays=" + customArrays)
                .toString();
    }
}
