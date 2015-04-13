package EPAM2015_lab2.task1;

import static java.lang.Math.abs;
import static java.lang.Math.log10;

public class DigitsQuantityCalculator {

    public static int calculate(long input) {
        return input == 0 ? 1
                :
                input == Long.MIN_VALUE ? 19
                        :
                        (int) log10(abs(input)) + 1;
    }

/*    public static int claculate(String input) {
        BigInteger in = new BigInteger(input);
        if (in.equals(BigInteger.ZERO)) {
            return 0;
        }
        int count = 0;
        while (in.abs().compareTo(BigInteger.ZERO) > 0) {
            in = in.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }*/
}