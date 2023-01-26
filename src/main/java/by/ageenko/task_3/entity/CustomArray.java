package by.ageenko.task_3.entity;

import by.ageenko.task_3.generator.IdGenerator;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {
    private int arrayId;
    private int[] array;

    public CustomArray() {
        this.arrayId = IdGenerator.generateIdOfArray();
    }

    public CustomArray(int[] array) {
        this.array = array;
        this.arrayId = IdGenerator.generateIdOfArray();
    }

    public int getArrayId() {
        return arrayId;
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("arrayId=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
