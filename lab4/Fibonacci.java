import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
//        fibo(0) = 0;
//        fibo(1) = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibo(n-2) + fibo(n-1);
    }
}
