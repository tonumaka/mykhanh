package JavaBasic;

import java.util.Scanner;
public class AverageWithInputValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENTS = 3;
        int numberIn;
        int sum = 0;
        double average;
        boolean isValid;
        
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++){
            System.out.println("Enter the mark (0-100) for student " + studentNo +": ");
            isValid = false;
            do {
                numberIn = sc.nextInt();
                if (0 <= numberIn && numberIn <= 100){
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while(!isValid);
            sum += numberIn;
        }
        average = (double) sum/NUM_STUDENTS;
        System.out.println("The average is: " + average);
    }
}
