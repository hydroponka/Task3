package by.ageenko.task_3.service.changing;

import by.ageenko.task_3.entity.CustomArray;

public interface ChangeArrayService {
    int[] changeNegToPoz(CustomArray customArray);
    int[] changePozToNeg(CustomArray customArray);
}
