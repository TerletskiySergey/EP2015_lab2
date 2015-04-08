package EPAM2015_lab2.lab2;
import static java.lang.Math.*;

/**
 * Created by ICH on 03.04.2015.
 */
public class Math {

    public static int getDigitsQuant(int input){
        return getHighestOrder(input) + 1;
    }

    public static long reverse(long input){
        long toReturn = 0;
        int hiOrder = getHighestOrder(input);
        int curOrder = hiOrder;
        int curDigit;
        while(curOrder >= 0){
            curDigit = (int)(input / (int)pow(10, curOrder));
            input -= curDigit * pow(10, curOrder);
            toReturn += curDigit * pow(10, hiOrder - curOrder);
            curOrder--;
        }
        return toReturn;
    }

    public static double recursiveFactorial(int input){
        if (input < 0){
            throw new IllegalArgumentException();
        }
        if(input == 0){
            return 1;
        }
        return input * recursiveFactorial(input - 1);
    }

    public static double recursivePow(double base, int exponent){
        if (exponent < 0){
            throw new IllegalArgumentException();
        }
        if (base == 0 || base == 1){
            return base;
        }
        if (exponent == 0){
            return 1;
        }
        return base * recursivePow(base, exponent - 1);
    }

    public static long fibonacciNumber(int index){
        if (index < 0){
            throw new IllegalArgumentException();
        }
        if (index == 0 || index == 1){
            return 1;
        }
        return fibonacciNumber(index - 1) + fibonacciNumber(index - 2);
    }

    public static long setOrderValue(long number, int order, int value) {

        if (order < 0) {
            throw new IllegalArgumentException("order = " + order + " < 0");
        }
        if (value < 0 || value > 9) {
            throw new IllegalArgumentException("value = " + value + " is out of bounds");
        }
        if (order > getHighestOrder(number) && value == 0) {
            return number;
        }
        return number - (long) pow(10, order) * (getOrderValue(number, order) - value);
    }

    public static int getHighestOrder(long array) {
        return array == 0 ? 0 : (int) log10(array);
    }

    public static int getOrderValue(long number, int order) {
        int hiOrder = getHighestOrder(number);
        if (order > hiOrder) {
            return 0;
        }
        int curOrder = hiOrder;
        int curOrderValue = 0;
        while (curOrder >= order) {
            curOrderValue = (int) (number / pow(10, curOrder));
            number -= curOrderValue * pow(10, curOrder);
            curOrder--;
        }
        return curOrderValue;
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(11));
    }
}
