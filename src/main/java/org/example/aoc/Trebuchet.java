package org.example.aoc;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://adventofcode.com/2023/day/1
public class Trebuchet {

    private static final Pattern pattern = Pattern.compile("^\\D*(\\d)(?:.*?(\\d))?\\D*$");

    public static int getSum(String calibrationValues) {
        return Arrays.stream(calibrationValues.split("\n"))
                .map(
                        s -> {
                            Matcher matcher = pattern.matcher(s);
                            if (matcher.find()) {
                                String first = matcher.group(1);
                                String last = matcher.group(2);
                                return Integer.valueOf(first + (last != null ? last : first));
                            }
                            return null;
                        })
                .filter(Objects::nonNull)
                .reduce(0, Integer::sum);
    }
}
