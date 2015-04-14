package EPAM2015_lab2.task3;

public class RecursivePow {

    public static double calculate(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException(String.format("exponent = %d < 0", exponent));
        }
        if (Double.compare(base, 0) == 0) {
            if (exponent == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (Double.compare(base, 1) == 0){
            return 1;
        }
        if (exponent == 0) {
            return 1;
        }
        try {
            return base * calculate(base, exponent - 1);
        } catch (StackOverflowError er) {
            return Double.POSITIVE_INFINITY;
        }
    }
}
