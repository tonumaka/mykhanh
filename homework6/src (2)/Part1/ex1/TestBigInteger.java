package Part1.ex1;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger bigInteger2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        BigInteger resAdd = bigInteger1.add(bigInteger2);
        BigInteger resMul = bigInteger1.multiply(bigInteger2);
        System.out.printf("Sum is: %d%n", resAdd);
        System.out.printf("Multiple is: %d%n", resMul);
    }
}
