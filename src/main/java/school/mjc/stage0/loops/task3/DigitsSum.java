package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {

        int sum = 0;
        String numberString = String.valueOf(t);
        int length = numberString.length();

            for (int i = 0; i < length; i++) {
                int digit = numberString.charAt(i) - '0';
                sum += digit;
        }

        System.out.println(sum);


    }
}