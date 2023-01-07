import java.lang.Math;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.abs(a-b);
        }
        return gcd(b,a%b);
    }
}
