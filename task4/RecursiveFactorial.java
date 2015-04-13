package EPAM2015_lab2.task4;

import java.math.BigInteger;

public class RecursiveFactorial {
    public static BigInteger calculate(int input) {
        if (input < 0) {
            throw new IllegalArgumentException(String.format("Input value = %d < 0", input));
        }
        if (input == 0) {
            return new BigInteger("1");
        }
        try {
            BigInteger recursionResult = calculate(input - 1);
            if (recursionResult == null) {
                return null;
            }
            return new BigInteger(String.valueOf(input)).multiply(recursionResult);
        } catch (StackOverflowError er) {
            return null;
        }
    }
}
