import java.util.Scanner;

public class ArraysEqual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr1;
        int[] arr2;
        int size_arr1, size_arr2;

        System.out.print("Enter the size of array 1: ");
        size_arr1 = sc.nextInt();

        arr1 = new int[size_arr1];

        System.out.print("Enter the array 1: ");
        for (int i = 0; i < size_arr1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array 2: ");
        size_arr2 = sc.nextInt();

        arr2 = new int[size_arr2];
        System.out.print("Enter the array 2: ");
        for (int i = 0; i < size_arr2; i++){
            arr2[i] = sc.nextInt();
        }

        sc.close();

        if (equals(arr1, arr2)){
            System.out.println("Two arrays are the same");
        } else {
            System.out.println("Two arrays are not the same");
        }

        

    }

    public static boolean equals(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0, j = 0; i < arr1.length; i++, j++){
            if (arr1[i] != arr2[j]){
                return false;
            }
        }
        return true;
    }
}
