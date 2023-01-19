package by.ageenko.task_3.validator.impl;

import by.ageenko.task_3.validator.StringArrayValidator;

public class StringArrayValidatorImpl implements StringArrayValidator {
    private static final String INT_NUMBER_REGEX = "[+-]?\\d+";

    @Override
    public boolean stringNumberValidate(String stringNum) {
        boolean match = stringNum.matches(INT_NUMBER_REGEX);
        return match;
    }
}
