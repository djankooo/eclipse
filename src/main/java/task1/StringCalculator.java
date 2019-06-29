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

        for (String s : numbers.split("[,\n" + pattern + "]")) {
            if (isStringNumeric(s) && !s.isEmpty()) {

                if (Integer.valueOf(s) < 0) {
                    negativeNumbers.add(Integer.valueOf(s));
                } else {
                    sum += Integer.valueOf(s);
                }


            }
        }
        if (!negativeNumbers.isEmpty()) {
            throw new ArithmeticException("negatives not allowed -> " + negativeNumbers.toString());
        } else  {
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
}
