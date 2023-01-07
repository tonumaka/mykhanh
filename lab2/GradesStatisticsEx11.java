import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class GradesStatisticsEx11 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] grades;
    

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.println();
        System.out.println("The average is: " + average(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The maximun is: " + max(grades));
        System.out.println("The minimun is: " + min(grades));
        System.out.println("The standard deviation is: " + stdDev(grades));
    }

    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int num_students = sc.nextInt();

        grades = new int[num_students];

        for (int i = 0; i < grades.length; i++) {
            do{
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grades[i] = sc.nextInt();
            } while (grades[i] < 0 || grades[i] > 100);
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array.length != 1){
                if (i == 0){
                    System.out.print("[" + array[i] +", ");
                } else {
                    if (i == array.length - 1){
                        System.out.print(array[i] + "]");
                    } else {
                        System.out.print(array[i] + ", ");
                    }
                }
            }
            if (array.length == 1){
                System.out.println("[" + array[i] + "]");
            }
        }
    }
    
    public static double average(int[] array) {
        double avg;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        avg = (double) sum / array.length;
        return avg;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int size = array.length;

        if (array.length % 2 == 0) {
            return (double) ((array[size/2 - 1] + array[size/2 + 1 - 1]) / 2);
        } else {
            return (double) (array[(size+1)/2 - 1]);
        }
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double sum2 = 0;
        double mean = average(array);
        /*double avg;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        avg = (double) sum / array.length;
        */
        //int s = array.length;
        
        for (int i = 0; i < array.length; i++){
            sum2 += (double) (array[i] - mean)*(array[i] - mean);
        }
        double result = (double) sum2/array.length;
        return Math.sqrt(result);
    }
}
