import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int SECRET_NUMBER = scan.nextInt();
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        System.out.println("Key in your guess:");
        int k = 1;
        while (true) {
            int yourNumber = sc.nextInt();
            if (yourNumber < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else if (yourNumber > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("You got it in " + k + " trials!");
            }
            k++;
        }
    }

}