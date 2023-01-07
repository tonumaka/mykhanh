import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
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

        System.out.println("The index of your number is: " + binarySearch(arr, key, 0, arr.length));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
//        int firstIdx;
//        if (fromIdx == toIdx - 1) {
//            return (key == array[fromIdx]) ? true : false;
//        } else {
//            int middleIdx = (fromIdx + toIdx)/2;
//            if (key == array[middleIdx]) {
//                return true;
//            } else if (array[middleIdx] > key){
//                toIdx = middleIdx;
//            } else {
//                firstIdx = middleIdx + 1;
//            }
//        }
//
//        return binarySearch(array,key,fromIdx,toIdx);
        int middleIdx = (fromIdx + toIdx) / 2;
        if (fromIdx > toIdx) {
            return false;
        }
        if (array[middleIdx] == key) {
            return true;
        }
        if (array[middleIdx] > key) {
            return binarySearch(array, key, fromIdx, middleIdx - 1);
        }
        return binarySearch(array, key, middleIdx + 1, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }
}
