import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int NUM_STUDENTS;
        int[] grade;
        double average;
        int min;
        int max;

        do {
            System.out.print("Enter the number of students: "); 
            NUM_STUDENTS = sc.nextInt();
        } while (NUM_STUDENTS <= 0);

        grade = new int[NUM_STUDENTS];

        if (grade.length > 0){
            int sum = 0;
            for (int stuNo = 0; stuNo < grade.length; stuNo++){
                System.out.print("Enter the grade for student " + (stuNo + 1) + ": ");
                grade[stuNo] = sc.nextInt();
                sum += grade[stuNo];
            }
            average = (double) sum/NUM_STUDENTS;
            System.out.println("The average is: " + average);

            min = grade[0];
            max = grade[0];
            for (int stuNo = 1; stuNo < grade.length; stuNo++){
                if (grade[stuNo] < min){
                    min = grade[stuNo];
                }
                if (grade[stuNo] > max){
                    max = grade[stuNo];
                }
            }
            System.out.println("The minimun is: " + min);
            System.out.println("The maximun is: " + max);
        }
        sc.close();
    }
}
