package com.company.Exercises;

import java.util.List;

public class Exercise18 {

    public static String positiveSquare(List<Integer> nums) {
        StringBuilder stringBuilder = new StringBuilder();
        nums.stream()
                .filter(x -> x > 0)
                .map(x -> Math.pow(x, 2))
                .map(Double::intValue)
//    .map(x -> x * x) // Данную строчку можно использовать вместо ДВУХ предыдущих
                .forEach(str -> stringBuilder.append(str).append(","));
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return "\"" + stringBuilder.toString() + "\"";
    }
}
