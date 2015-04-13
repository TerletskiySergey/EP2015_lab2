package EPAM2015_lab2.task3;

public class RecursivePow {

    public static double calculate(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException();
        }
        if (Double.compare(exponent, 0) == 0) {
            return 1;
        }
        try {
            return base * calculate(base, exponent - 1);
        } catch (StackOverflowError er) {
            return Double.POSITIVE_INFINITY;
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(5,5));
        System.out.println(calculate(5,5));
    }
}
