package by.ageenko.task_3.service.changing;

public enum MathemeticalSign {
    NEGATIVE(-1),
    POZITIVE(1);
    private int value;

    MathemeticalSign(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

