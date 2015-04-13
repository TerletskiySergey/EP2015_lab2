package EPAM2015_lab2.task6;

import static java.lang.Math.exp;
import static java.lang.Math.log;

/**
 * Class Function by means of static method getValue determines the value of function y(a, x)=log2(x-4)+exp(2a-x)
 * depending on argument a and x values.
 */
public class Function {
    /**
     * Determines and returns the value of function y(a, x)=log2(x-4)+exp(2a-x) depending on argument a and x values.
     * Additionally performs range of definition check for x argument.
     *
     * @param x double value x argument of function y(a, x)=log2(x-4)+exp(2a-x).
     * @param a double value a argument of function y(a, x)=log2(x-4)+exp(2a-x).
     * @return double value of function y(a, x)=log2(x-4)+exp(2a-x).
     * @throws java.lang.IllegalArgumentException In case if value of x argument is out of range of definition.
     */
    public static double getValue(double x, double a) {
        inputCheck(x);
        return log(x - 4) / log(2) + exp(2 * a - x);
    }

    private static void inputCheck(double x) {
        if (x - 4 < 0) {
            throw new IllegalArgumentException(String.format("Parameter x = %.1f is out of bounds", x));
        }
    }
}
