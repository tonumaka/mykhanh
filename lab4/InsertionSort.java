import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array's length: ");
        int n = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
    public static void insertionSort(int[] array) {
        int empty;
        int insert;

        for (int i = 0; i < array.length; i++) {
            empty = array[i];
            insert = i;
            while (insert > 0 && array[insert-1] > empty) {
                array[insert] = array[insert-1];
                insert--;
            }
            if (insert != i) {
                array[insert] = empty;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
