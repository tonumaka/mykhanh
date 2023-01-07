import java.util.Scanner;

public class MagicSum{
    public static void main(String[] args){
        final int SENTINEL = -1;
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = sc.nextInt();

        if (hasEight(number)){
            sum += number;
        }
        
        while (number != SENTINEL){
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
            if (hasEight(number)){
                sum += number;
            }
        }

        System.out.println("The magic sum is: " + sum);

        sc.close();
    }



    public static boolean hasEight(int number){
        int digit;
        while (number > 0){
            digit = number % 10;
            if (digit != 8){
                number /= 10;
            }
            if (digit == 8){
                return true;
            }
        }
        return false;
    }
}