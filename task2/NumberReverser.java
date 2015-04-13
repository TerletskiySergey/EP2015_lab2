package EPAM2015_lab2.task2;

import static EPAM2015_lab2.task1.DigitsQuantityCalculator.calculate;
import static java.lang.Math.pow;

public class NumberReverser {

    public static long reverse(long input) {
        int hiOrder = calculate(input) - 1;
        int curOrder = hiOrder;
        int curDigit;
        long out = 0;
        while (curOrder >= 0) {
            curDigit = (int) (input / pow(10, curOrder));
            input -= curDigit * (long) pow(10, curOrder);
            out += curDigit * (long) pow(10, hiOrder - curOrder);
            curOrder--;
        }
        return out;
    }

/*    public static BigInteger reverse(String input){
        BigInteger in = new BigInteger(input);
        int hiOrder = calculate(input) - 1;
        if (hiOrder == 0){
            return in;
        }
        int curOrder = 0;
        BigInteger[] divResult;
        BigInteger out = BigInteger.ZERO;
        while(curOrder <= hiOrder){
            divResult = in.divideAndRemainder(BigInteger.TEN);
            in = divResult[0];
            out = out.add(BigInteger.TEN.pow(hiOrder - curOrder).multiply(divResult[1]));
            curOrder++;
        }
        return out;
    }*/
}
