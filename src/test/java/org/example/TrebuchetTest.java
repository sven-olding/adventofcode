package org.example;


import org.example.aoc.Trebuchet;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://adventofcode.com/2023/day/1
class TrebuchetTest {

    private final static List<Arguments> testTrebuchet = List.of(
            Arguments.of("""
                    1abc2
                    pqr3stu8vwx
                    a1b2c3d4e5f
                    zzzzz
                    treb7uchet""", 142),
            Arguments.of("""
                    iji3idjwi54
                    lknvb572l
                    ojvbz2091kwod876""", 112)
    );

    @ParameterizedTest
    @FieldSource
    void testTrebuchet(String calibrationValues, int expectedSum) {
        assertEquals(expectedSum, Trebuchet.getSum(calibrationValues));
    }
}
