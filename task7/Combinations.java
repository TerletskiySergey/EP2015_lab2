package EPAM2015_lab2.task7;

import static EPAM2015_lab2.task1.DigitsQuantityCalculator.calculate;
import static java.lang.Math.pow;

public class Combinations {

    private static long booleanArray;
    private static long combination;
    private static int alphabetLength;
    private static int combCounter;

    public static void show(int alphabetLength, int groupLength) {
        inputCheck(alphabetLength, groupLength);
        booleanArray = 0;
        combination = 0;
        Combinations.alphabetLength = alphabetLength;
        combCounter = 0;
        showRecursive(groupLength - 1);
    }

    private static void showRecursive(int order) {
        if (order == -1) {
            printCombination(combination);
            return;
        }
        for (int i = 1; i <= alphabetLength; i++) {
            if (getOrderValue(booleanArray, i) == 0) {
                booleanArray = setOrderValue(booleanArray, i, 1);
                combination = setOrderValue(combination, order, i);
                showRecursive(order - 1);
                booleanArray = setOrderValue(booleanArray, i, 0);
            }
        }
    }

    private static void inputCheck(int alphabetLength, int groupLength) {
        if (alphabetLength > 9 || alphabetLength <= 0) {
            throw new IllegalArgumentException("incorrect alphabet length = " + alphabetLength);
        }
        if (groupLength > alphabetLength || groupLength <= 0) {
            throw new IllegalArgumentException("incorrect group length = " + groupLength);
        }
    }

    private static int getOrderValue(long number, int order) {
        int hiOrder = calculate(number) - 1;
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

    private static long setOrderValue(long number, int order, int value) {

        if (order < 0) {
            throw new IllegalArgumentException("order = " + order + " < 0");
        }
        if (value < 0 || value > 9) {
            throw new IllegalArgumentException("value = " + value + " is out of bounds");
        }
        if (order + 1 > calculate(number) && value == 0) {
            return number;
        }
        return number - (long) pow(10, order) * (getOrderValue(number, order) - value);
    }

    private static void printCombination(long comb) {
        System.out.print("(");
        int curOrder = calculate(comb) - 1;
        int curOrderValue;
        while (curOrder >= 0) {
            curOrderValue = (int) (comb / pow(10, curOrder));
            comb -= curOrderValue * pow(10, curOrder);
            System.out.print(curOrderValue);
            if (curOrder != 0) {
                System.out.print(", ");
            } else {
                System.out.printf("): Combination #%d\n", ++combCounter);
            }
            curOrder--;
        }
    }
}
