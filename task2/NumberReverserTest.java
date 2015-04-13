package EPAM2015_lab2.task2;

public class NumberReverserTest {

    private long actual;
    private long expected;

    public void testReverseMin() {
        expected = -8085774586302733229l;
        actual = NumberReverser.reverse(Long.MIN_VALUE);
        printTestResult();
    }

    public void testReverseMax() {
        expected = 7085774586302733229l;
        actual = NumberReverser.reverse(Long.MAX_VALUE);
        printTestResult();
    }

    public void testReverseZero() {
        expected = 0;
        actual = NumberReverser.reverse(0);
        printTestResult();
    }

    public void testReversePositiveMiddle() {
        expected = 123456789;
        actual = NumberReverser.reverse(9876543210l);
        printTestResult();
    }

    public void testReverseNegativeMiddle() {
        expected = -123456789;
        actual = NumberReverser.reverse(-9876543210l);
        printTestResult();
    }

    public void testReversePositiveSingleDigitNumber() {
        expected = 1;
        actual = NumberReverser.reverse(1);
        printTestResult();
    }

    public void testReverseNegativeSingleDigitNumber() {
        expected = -1;
        actual = NumberReverser.reverse(-1);
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
        NumberReverserTest driver = new NumberReverserTest();
        driver.testReverseMin();
        driver.testReverseMax();
        driver.testReverseZero();
        driver.testReversePositiveMiddle();
        driver.testReverseNegativeMiddle();
        driver.testReversePositiveSingleDigitNumber();
        driver.testReverseNegativeSingleDigitNumber();
    }
}
