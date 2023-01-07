import java.util.Scanner;

public class CheckIfContain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size, key;
        int[] array;

        System.out.print("Enter the size: ");
        size = sc.nextInt();

        array = new int[size];

        System.out.print("Enter the array: ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter a number you want to check: ");
        key = sc.nextInt();

        if (contains(array, key)){
            System.out.println("The array contains the number " + key);
        } else {
            System.out.println("The array does not contain the number " + key);
        }

        sc.close();
    }


    public static boolean contains(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }

}
