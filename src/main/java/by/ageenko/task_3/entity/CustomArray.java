package by.ageenko.task_3.entity;

import by.ageenko.task_3.exception.CustomArrayException;
import by.ageenko.task_3.observer.ArrayStatisticsObserver;
import by.ageenko.task_3.observer.impl.ArrayStatisticsObserverImpl;
import by.ageenko.task_3.util.IdGenerator;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {
    private int arrayId;
    private int[] array;
    ArrayStatisticsObserver observer;
    public CustomArray() {
        this.arrayId = IdGenerator.generateIdOfArray();
        observer = new ArrayStatisticsObserverImpl();
    }
    public void removeObserver(){
        observer = null;
    }
    public void addObserver(){
        observer = new ArrayStatisticsObserverImpl();
    }

    public CustomArray(int[] array) {
        this.array = array;
        this.arrayId = IdGenerator.generateIdOfArray();
        observer = new ArrayStatisticsObserverImpl();
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) throws CustomArrayException {
        this.array = array;
        notifyObserver();
    }
    public void setElement(int index, int value) throws CustomArrayException {
        array[index] = value;
        notifyObserver();
    }
    private void notifyObserver() throws CustomArrayException {
        if (observer!=null){
            observer.changeArrayElement(this);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("arrayId=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
