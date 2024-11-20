package org.example.aoc;

import java.util.List;
import java.util.Map;

// https://adventofcode.com/2023/day/2
public class CubeConundrum {

    public static int getSumOfMatchingGameIds(
            List<List<Map<String, Integer>>> games, int redCubes, int greenCubes, int blueCubes) {
        int sum = 0;
        for (int gameId = 1; gameId <= games.size(); gameId++) {
            var game = games.get(gameId - 1);
            boolean gamePossible = true;
            for (var draw : game) {
                if (!drawMatches(draw, redCubes, greenCubes, blueCubes)) {
                    gamePossible = false;
                }
            }
            if (gamePossible) {
                sum += gameId;
            }
        }

        return sum;
    }

    private static boolean drawMatches(Map<String, Integer> draw, int red, int green, int blue) {
        if (draw.containsKey("red") && draw.get("red") > red) return false;
        if (draw.containsKey("blue") && draw.get("blue") > blue) return false;
        if (draw.containsKey("green") && draw.get("green") > green) return false;

        return true;
    }
}
