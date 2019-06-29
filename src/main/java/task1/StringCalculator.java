package task1;

public class StringCalculator
{

    public static int add(String numbers){

        int sum = 0, argumentsCounter = 0;

        for(String s : numbers.split(",")) {
                if (isStringNumeric(s) && !s.isEmpty()) {
                    if(argumentsCounter>2){
                        System.out.println("Too much arguments, required max 2!");
                        return 0;
                    }
                    sum += Integer.valueOf(s);
                    argumentsCounter++;
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
