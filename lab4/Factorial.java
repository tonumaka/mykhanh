import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
}
