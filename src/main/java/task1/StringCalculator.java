package task1;

public class StringCalculator
{

    public static int add(String numbers){

        int sum = 0;
        String pattern = "";

        if(numbers.startsWith("//")) {
            pattern = numbers.substring(numbers.indexOf("//") + 2);
            pattern = pattern.substring(0, pattern.indexOf("\n"));
        }


        for(String s : numbers.split("[,\n"+pattern+"]")) {
                if (isStringNumeric(s) && !s.isEmpty()) {
                    sum += Integer.valueOf(s);
                }
        }
        return sum;
    }

    private static boolean isStringNumeric(String string){
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

}
