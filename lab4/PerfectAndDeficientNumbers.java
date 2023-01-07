import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        System.out.println("These numbers are perfect: ");
        int count = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("[" + count + " perfect numbers found (" + (count * 100 / upperBound) + ")]");

        System.out.println("These numbers are neither deficient nor perfect: ");
        int count2 = 0;
        for (int i = 1; i < upperBound; i++) {
            if (!(isPerfect(i)) && !(isDeficient(i))) {
                System.out.print(i + " ");
                count2++;
            }
        }
        System.out.println("[" + count2 + " numbers found (" + (count2 * 100 / upperBound) + ")]");
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }
}

