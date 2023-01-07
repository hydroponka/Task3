package by.ageenko.task_3.array;

import java.util.Arrays;
import java.util.StringJoiner;

public class Array {
    private int arrayId;
    private int [] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Array.class.getSimpleName() + "[", "]")
                .add("arrayId=" + arrayId)
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
