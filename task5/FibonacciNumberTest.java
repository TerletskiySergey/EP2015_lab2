package EPAM2015_lab2.task5;

public class FibonacciNumberTest {
    private int actual;
    private int expected;

    public void testGetIndexZero() {
        expected = 0;
        actual = FibonacciNumber.get(0);
        printTestResult();
    }

    public void testGetIndexOne() {
        expected = 1;
        actual = FibonacciNumber.get(1);
        printTestResult();
    }

    public void testGetIndexTwo() {
        expected = 1;
        actual = FibonacciNumber.get(1);
        printTestResult();
    }

    public void testGetIndexMiddle() {
        expected = 9227465;
        actual = FibonacciNumber.get(35);
        printTestResult();
    }

    public void testGetIndexMin() {
        expected = 0;
        actual = 1;
        try {
            actual = FibonacciNumber.get(Integer.MIN_VALUE);
        } catch (IllegalArgumentException ex) {
            actual = 0;
        }
        printTestResult();
    }

    public void testGetIndexMax() {
        expected = -1;
        actual = FibonacciNumber.get(Integer.MAX_VALUE);
        printTestResult();
    }

    public void testGetValueBiggerIntegerMAX() {
        expected = 0;
        actual = 1;
        try {
            actual = FibonacciNumber.get(1000);
        } catch (Exception ex) {
            actual = 0;
        }
        printTestResult();
    }

    private void printTestResult() {
        if (expected == actual) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public static void main(String[] args) {
        FibonacciNumberTest driver = new FibonacciNumberTest();
        driver.testGetIndexZero();
        driver.testGetIndexOne();
        driver.testGetIndexTwo();
        driver.testGetIndexMiddle();
        driver.testGetIndexMin();
        driver.testGetIndexMax();
        driver.testGetValueBiggerIntegerMAX();
    }
}
