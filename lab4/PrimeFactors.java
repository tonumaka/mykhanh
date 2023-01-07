import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        System.out.println("These numbers are equal to the product of prime factors: ");
        int count = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("[" + count + " numbers found (" + (count * 100 / upperBound) + "%)]");
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int prod = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                prod *= i;
                if (prod > aPosInt) {
                    return false;
                }
            }
        }
        return prod == aPosInt;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 3; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
