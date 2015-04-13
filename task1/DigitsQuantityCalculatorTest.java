package EPAM2015_lab2.task1;

/**
 * Created by ICH on 10.04.2015.
 */
public class DigitsQuantityCalculatorTest {

    private int actual;
    private int expected;

    public void testCalculateMin(){
        expected = 19;
        actual = DigitsQuantityCalculator.calculate(Long.MIN_VALUE);
        printTestResult();
    }

    public void testCalculateMax(){
        expected = 19;
        actual = DigitsQuantityCalculator.calculate(Long.MAX_VALUE);
        printTestResult();
    }

    public void testCalculateZero(){
        expected = 1;
        actual = DigitsQuantityCalculator.calculate(0);
        printTestResult();
    }

    public void testCalculatePositiveMiddle(){
        expected = 10;
        actual = DigitsQuantityCalculator.calculate(9876543210l);
        printTestResult();
    }

    public void testCalculateNegativeMiddle(){
        expected = 10;
        actual = DigitsQuantityCalculator.calculate(-9876543210l);
        printTestResult();
    }

    public void testCalculatePositiveSingleDigitNumber(){
        expected = 1;
        actual = DigitsQuantityCalculator.calculate(1);
        printTestResult();
    }

    public void testCalculateNegativeSingleDigitNumber(){
        expected = 1;
        actual = DigitsQuantityCalculator.calculate(-1);
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
        DigitsQuantityCalculatorTest driver = new DigitsQuantityCalculatorTest();
        driver.testCalculateMin();
        driver.testCalculateMax();
        driver.testCalculateZero();
        driver.testCalculatePositiveMiddle();
        driver.testCalculateNegativeMiddle();
        driver.testCalculatePositiveSingleDigitNumber();
        driver.testCalculateNegativeSingleDigitNumber();
    }
}
