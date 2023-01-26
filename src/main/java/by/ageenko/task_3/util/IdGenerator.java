package by.ageenko.task_3.util;

public class IdGenerator {
    private static int idOfArray;

    private IdGenerator() {
    }

    public static int generateIdOfArray() {
        idOfArray++;
        return idOfArray;
    }
}
