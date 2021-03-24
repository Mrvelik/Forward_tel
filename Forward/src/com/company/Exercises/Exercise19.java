package com.company.Exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise19 {

    public static List<Integer> mapToList(Map<String, List<Integer>> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
