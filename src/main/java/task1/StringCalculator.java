package task1;

import java.util.ArrayList;

public class StringCalculator {

    public static int add(String numbers) throws ArithmeticException {

        int sum = 0;
        String pattern = "";
        ArrayList<Integer> negativeNumbers = new ArrayList<>();

        if (numbers.startsWith("//")) {
            pattern = numbers.substring(numbers.indexOf("//") + 2);
            pattern = pattern.substring(0, pattern.indexOf("\n"));
        }

        if (numbers.startsWith("//[")) {
            pattern += stringOfPatterns(numbers);
        }

        for (String s : numbers.split("[,\n" + pattern + "]")) {
            if (isStringNumeric(s) && !s.isEmpty()) {
                if (Integer.valueOf(s) < 0) {
                    negativeNumbers.add(Integer.valueOf(s));
                } else {
                    if (Integer.valueOf(s) < 1000) {
                        sum += Integer.valueOf(s);
                    }
                }
            }
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed -> " + negativeNumbers.toString());
        } else {
            return sum;
        }
    }

    private static boolean isStringNumeric(String string) {

        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') {
                return false;
            }
        }
        return true;
    }

    private static String stringOfPatterns(String string) {

        String pattern = "";
        int index = 0, index2 = 0;

        while (index != -1) {
            index = string.indexOf("[", index);
            index2 = string.indexOf("]", index2);
            if (index != -1 && index != -1) {
                pattern+=string.substring(index + 1, index2);
                index++;
                index2++;
            }

        }
        return pattern;
    }
}
