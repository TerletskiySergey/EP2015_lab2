package EPAM2015_lab2.task5;

public class FibonacciNumber {

    private static final int RECURSIVE_BORDER_VALUE = Integer.MAX_VALUE;

    private static class IntegerValueOverflowException extends RuntimeException {
    }

    public static int get(int index) {
        indexCheck(index);
        if (index == 0) {
            return 0;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        try {
            long prev1 = get(index - 1);
            if (prev1 == -1){
                return -1;
            }
            long prev2 = (get(index - 2));
            if (prev2 == -1){
                return -1;
            }
            if (prev1 + prev2 > RECURSIVE_BORDER_VALUE) {
                throw new IntegerValueOverflowException();
            }
            return (int) (prev1 + prev2);
        } catch (StackOverflowError er) {
            return -1;
        }
    }

/*    public static BigInteger getIterative(int index) {
        indexCheck(index);
        if (index == 0) {
            return BigInteger.ZERO;
        }
        BigInteger prev = BigInteger.ONE;
        BigInteger cur = BigInteger.ONE;
        for (int i = 0; i < index - 2; i++) {
            cur = cur.add(prev);
            prev = cur.subtract(prev);
        }
        return cur;
    }*/

    private static void indexCheck(int index) {
        if (index < 0) {
            throw new IllegalArgumentException(String.format("Index = %d < 0", index));
        }
    }
}
