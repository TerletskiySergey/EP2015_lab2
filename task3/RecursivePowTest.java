package EPAM2015_lab2.task3;

import java.math.BigDecimal;

public class RecursivePowTest {

    private static final double POSITIVE_AVERAGE_VALUE = 5;
    private double actual;
    private Double expected;
    private double[] baseValues;
    private int[] exponentValues;
    private int counter;

    public RecursivePowTest() {
        baseValues = new double[]{
                0,
                1,
                Double.MAX_VALUE,
                -Double.MAX_VALUE,
                Double.POSITIVE_INFINITY,
                Double.NEGATIVE_INFINITY,
                POSITIVE_AVERAGE_VALUE,
                -POSITIVE_AVERAGE_VALUE,
                Double.NaN
        };
        exponentValues = new int[]{
                0,
                1,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                (int) POSITIVE_AVERAGE_VALUE,
                -(int) POSITIVE_AVERAGE_VALUE
        };
    }

    public void testCalculate() {
        for (double base : baseValues) {
            for (int exponent : exponentValues) {
                expected = Math.pow(base, exponent);
                try {
                    actual = RecursivePow.calculate(base, exponent);
                } catch (IllegalArgumentException ex) {
                    if (exponent < 0){
                        expected = null;
                    }
                }
                printTestResult(base, exponent);
            }
        }
    }

    private void printTestResult(double base, int exponent) {

        System.out.printf("Test #%d: base = %g, exponent = %d\n", ++counter, base, exponent);
        if(expected == null){
            System.out.print("Expected: IllegalArgumentException thrown, ");
            System.out.print("Actual: IllegalArgumentException thrown");
            System.out.println("\nTest OK\n");
            return;
        }
        System.out.printf("Expected value = %g, Actual value = %g\n", expected, actual);
        if (Double.isNaN(expected)) {
            if (Double.isNaN(actual)) {
                System.out.println("Test OK\n");
            } else {
                System.out.println("Test failed\n");
            }
            return;
        }
        if (Double.isInfinite(expected)) {
            if (Double.isInfinite(actual)) {
                System.out.println("Test OK\n");
            } else {
                System.out.println("Test failed\n");
            }
            return;
        }
        if (Double.isNaN(actual) || Double.isInfinite(actual)) {
            System.out.println("Test failed\n");
            return;
        }
        BigDecimal expected = new BigDecimal(this.expected);
        BigDecimal actual = new BigDecimal(this.actual);
        if (expected.setScale(6, BigDecimal.ROUND_HALF_UP).equals(actual.setScale(6, BigDecimal.ROUND_HALF_UP))) {
            System.out.println("Test OK\n");
        } else {
            System.out.println("Test failed\n");
        }
    }

    public static void main(String[] args) {
        RecursivePowTest driver = new RecursivePowTest();
        driver.testCalculate();
    }
}
