package EPAM2015_lab2.task6;

import java.math.BigDecimal;

public class FunctionTest {

    private double actual;
    private double expected;

    public void testGetValueXPosInfAPosInf() {
        expected = Double.NaN;
        actual = Function.getValue(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueXPosInfANegInf() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueXPosInfAMin() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(Double.POSITIVE_INFINITY, -Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueXPosInfAMax() {
        expected = Double.NaN;
        actual = Function.getValue(Double.POSITIVE_INFINITY, Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueXPosInfAMiddle() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(Double.POSITIVE_INFINITY, 50);
        printTestResult();
    }

    public void testGetValueXNegInfAPosInf() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXNegInfANegInf() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXNegInfAMin() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(Double.NEGATIVE_INFINITY, -Double.MAX_VALUE);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXNegInfAMax() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(Double.NEGATIVE_INFINITY, Double.MAX_VALUE);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXNegInfAMiddle() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(Double.NEGATIVE_INFINITY, 50);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXMinAPosInf() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(-Double.MAX_VALUE, Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXMinANegInf() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXMinAMin() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXMinAMax() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(-Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXMinAMiddle() {
        expected = 0;
        actual = 1;
        try {
            actual = Function.getValue(-Double.MAX_VALUE, 50);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetValueXMaxAPosInf() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(Double.MAX_VALUE, Double.POSITIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueXMaxANegInf() {
        expected = 1024;
        actual = Function.getValue(Double.MAX_VALUE, Double.NEGATIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueXMaxAMin() {
        expected = 1024;
        actual = Function.getValue(Double.MAX_VALUE, -Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueXMaxAMax() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(Double.MAX_VALUE, Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueXMaxAMiddle() {
        expected = 1024;
        actual = Function.getValue(Double.MAX_VALUE, 50);
        printTestResult();
    }

    public void testGetValueX4APosInf() {
        expected = Double.NaN;
        actual = Function.getValue(4, Double.POSITIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueX4ANegInf() {
        expected = Double.NEGATIVE_INFINITY;
        actual = Function.getValue(4, Double.NEGATIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueX4AMin() {
        expected = Double.NEGATIVE_INFINITY;
        actual = Function.getValue(4, -Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueX4AMax() {
        expected = Double.NaN;
        actual = Function.getValue(4, Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueX4AMiddle() {
        expected = Double.NEGATIVE_INFINITY;
        actual = Function.getValue(4, 50);
        printTestResult();
    }

    public void testGetValueXMiddleAPosInf() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(50, Double.POSITIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueXMiddleANegInf() {
        expected = 5.5235619560570125;
        actual = Function.getValue(50, Double.NEGATIVE_INFINITY);
        printTestResult();
    }

    public void testGetValueXMiddleAMin() {
        expected = 5.5235619560570125;
        actual = Function.getValue(50, -Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueXMiddleAMax() {
        expected = Double.POSITIVE_INFINITY;
        actual = Function.getValue(50, Double.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueXMiddleAMiddle() {
        expected = 5184705528587072464092.9768848895423974;
        actual = Function.getValue(50, 50);
        printTestResult();
    }

    private void printTestResult() {

        if (Double.isNaN(expected)) {
            if (Double.isNaN(actual)) {
                System.out.println("Test OK");
            } else {
                System.out.println("Test failed");
            }
            return;
        }
        if (Double.isInfinite(expected)) {
            if (Double.isInfinite(actual)) {
                System.out.println("Test OK");
            } else {
                System.out.println("Test failed");
            }
            return;
        }
        if (Double.isNaN(actual) || Double.isInfinite(actual)) {
            System.out.println("Test failed");
        }
        BigDecimal expected = new BigDecimal(this.expected);
        BigDecimal actual = new BigDecimal(this.actual);
        if (expected.setScale(6, BigDecimal.ROUND_HALF_UP).equals(actual.setScale(6, BigDecimal.ROUND_HALF_UP))) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public static void main(String[] args) {
        FunctionTest driver = new FunctionTest();

        driver.testGetValueXPosInfAPosInf();
        driver.testGetValueXPosInfANegInf();
        driver.testGetValueXPosInfAMin();
        driver.testGetValueXPosInfAMax();
        driver.testGetValueXPosInfAMiddle();

        driver.testGetValueXNegInfAPosInf();
        driver.testGetValueXNegInfANegInf();
        driver.testGetValueXNegInfAMin();
        driver.testGetValueXNegInfAMax();
        driver.testGetValueXNegInfAMiddle();

        driver.testGetValueXMinAPosInf();
        driver.testGetValueXMinANegInf();
        driver.testGetValueXMinAMin();
        driver.testGetValueXMinAMax();
        driver.testGetValueXMinAMiddle();

        driver.testGetValueXMaxAPosInf();
        driver.testGetValueXMaxANegInf();
        driver.testGetValueXMaxAMin();
        driver.testGetValueXMaxAMax();
        driver.testGetValueXMaxAMiddle();

        driver.testGetValueX4APosInf();
        driver.testGetValueX4ANegInf();
        driver.testGetValueX4AMin();
        driver.testGetValueX4AMax();
        driver.testGetValueX4AMiddle();

        driver.testGetValueXMiddleAPosInf();
        driver.testGetValueXMiddleANegInf();
        driver.testGetValueXMiddleAMin();
        driver.testGetValueXMiddleAMax();
        driver.testGetValueXMiddleAMiddle();
    }
}
