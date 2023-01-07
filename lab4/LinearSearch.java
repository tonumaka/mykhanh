import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of arrays: ");
        int numb = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] arr = new int[numb];
        for (int i = 0; i < numb; i++) {
                arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int key = sc.nextInt();
        System.out.println("The index of your number is: " + linearSearchIndex(arr, key));

    }
//    public static int[] inputArray(int n) {
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        return arr;
//    }

    public static boolean isExist(int [] array, int key) {
        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int [] array, int key) {
        if (isExist(array,key)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    return i;
                }
            }
        }
        return 0;
    }
}
