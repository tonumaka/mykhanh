import java.util.Scanner;

public class TrigonometricSeries {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
    System.out.print("Enter the radian: ");
    double x = sc.nextDouble();
    System.out.print("Enter the number of terms: ");
    int numTerms = sc.nextInt();
    System.out.println("sin(" + x + ") = " + sin(x, numTerms));
    System.out.println(Math.sin(x));
    System.out.println("cos(" + x + ") = " + cos(x, numTerms));
    System.out.println(Math.cos(x));
    }

    public static double sin(double x, int numTerms) {
        double sin = 0.0;
        for (int i = 1; i <= numTerms; i+=2) {
            if (i % 4 == 3) {
                sin -= calculate(x,i);
            } else {
                sin += calculate(x,i);
            }
        }

        return sin;
    }

    public static double cos(double x, int numTerms) {
        double cos = 0.0;
        for (int i = 2; i <= numTerms; i+=2) {
            if (i % 4 == 2) {
                cos -= calculate(x,i);
            } else {
                cos += calculate(x,i);
            }
        }
        return cos + 1;
    }


    public static double calculate(double x, int n) {
        double multi = 1.0;
        for (int i = 1; i <= n; i++) {
            multi *= (double) x/i;
        }
        return multi;
    }

}
