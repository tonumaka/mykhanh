package JavaBasic;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;

        while (flag){
            System.out.println("Enter a number between 0-10 or 90-100: ");
            int inNumber = sc.nextInt();
            if ((0 <= inNumber && inNumber <= 10) || (90 <=inNumber && inNumber <=100)){
                System.out.println("You have entered: " + inNumber);
                flag = false;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
    }
}
