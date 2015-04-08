package EPAM2015_lab2.lab2;

import static java.lang.Math.pow;

/**
 * Created by ICH on 06.04.2015.
 */
public class Combinations {

    private static long booleanArray;
    private static long combination;
    private static int alphabetLength;

    public static void showAllCombinations(int alphabetLength, int groupLength) {
        if (alphabetLength > 9 || alphabetLength <= 0) {
            throw new IllegalArgumentException("incorrect alphabet length = " + alphabetLength);
        }
        if (groupLength > alphabetLength || alphabetLength <= 0) {
            throw new IllegalArgumentException("incorrect group length = " + groupLength);
        }
        booleanArray = 0;
        combination = 0;
        Combinations.alphabetLength = alphabetLength;
        combinations(groupLength - 1);
    }

    private static void combinations(int order) {
        if (order == -1) {
            showCombination(combination);
            return;
        }
        for (int i = 1; i <= alphabetLength; i++) {
            if (Math.getOrderValue(booleanArray, i) == 0) {
                booleanArray = Math.setOrderValue(booleanArray, i, 1);
                combination = Math.setOrderValue(combination, order, i);
                combinations(order - 1);
                booleanArray = Math.setOrderValue(booleanArray, i, 0);
            }
        }
    }

    private static void showCombination(long comb) {
        System.out.print("(");
        int curOrder = Math.getHighestOrder(comb);
        int curOrderValue;
        while (curOrder >= 0) {
            curOrderValue = (int) (comb / pow(10, curOrder));
            comb -= curOrderValue * pow(10, curOrder);
            System.out.print(curOrderValue);
            if (curOrder != 0) {
                System.out.print(", ");
            } else {
                System.out.print(")\n");
            }
            curOrder--;
        }
    }
}
