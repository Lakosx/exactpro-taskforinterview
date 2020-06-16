package com.devskiller;

import java.util.*;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>(integers);
        for (Integer temp : uniqueSet) {
            if (temp == null) {
                continue;
            }
            int i = Collections.frequency(integers, temp);
            if (i == numberOfDuplicates) {
                result.add(temp);
            }
        }
        return result;
    }
}
