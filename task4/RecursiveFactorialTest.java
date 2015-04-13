package EPAM2015_lab2.task4;

import java.math.BigInteger;

/**
 * Created by ICH on 10.04.2015.
 */
public class RecursiveFactorialTest {

    private BigInteger actual;
    private BigInteger expected;

    public void testCalculateMin() {
        expected = BigInteger.ZERO;
        actual = BigInteger.ONE;
        try {
            actual = RecursiveFactorial.calculate(Integer.MIN_VALUE);
        } catch (IllegalArgumentException ex) {
            actual = BigInteger.ZERO;
        }
        printTestResult();
    }

    public void testCalculateMax() {
        expected = null;
        actual = RecursiveFactorial.calculate(Integer.MAX_VALUE);
        printTestResult();
    }

    public void testCalculateZero() {
        expected = BigInteger.ONE;
        actual = RecursiveFactorial.calculate(0);
        printTestResult();
    }

    public void testCalculatePositiveMiddle() {
        expected = new BigInteger("15511210043330985984000000");
        actual = RecursiveFactorial.calculate(25);
        printTestResult();
    }

    public void testCalculateNegativeMiddle() {
        expected = BigInteger.ZERO;
        actual = BigInteger.ONE;
        try {
            actual = RecursiveFactorial.calculate(-25);
        } catch (IllegalArgumentException ex) {
            actual = BigInteger.ZERO;
        }
        printTestResult();
    }

    private void printTestResult() {
        if (expected == null && actual == null || expected.equals(actual)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public static void main(String[] args) {
        RecursiveFactorialTest driver = new RecursiveFactorialTest();
        driver.testCalculateMin();
        driver.testCalculateMax();
        driver.testCalculateZero();
        driver.testCalculatePositiveMiddle();
        driver.testCalculateNegativeMiddle();
    }
}
