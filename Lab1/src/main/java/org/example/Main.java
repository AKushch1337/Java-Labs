package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[] filterStringsByLength(String[] input, boolean shorterThanAverage) {
        if (input == null || input.length == 0) {
            return new String[0];
        }

        int totalLength = 0;
        for (String str : input) {
            totalLength += str.length();
        }

        double averageLength =  (double) totalLength / input.length;

        List<String> filteredStrings = new ArrayList<>();
        for (String str : input) {
            if (shorterThanAverage && str.length() < averageLength) {
                filteredStrings.add(str);
            }
            else if (!shorterThanAverage && str.length() > averageLength) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] inputStrings = {"kotlin", "is", "better", "than", "java", "obviously", "whath", "omgom"};

        String[] shorterThanAverage = filterStringsByLength(inputStrings, true);
        System.out.println("Less than avg: ");
        for (String str : shorterThanAverage) {
            System.out.println(str);
        }

        String[] longerThanAverage = filterStringsByLength(inputStrings, false);
        System.out.println("\nMore than avg: ");
        for (String str : longerThanAverage) {
            System.out.println(str);
        }
    }
}