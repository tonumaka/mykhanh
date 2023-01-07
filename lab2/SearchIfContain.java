import java.util.Scanner;

public class SearchIfContain {
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

        System.out.println(search(array, key));

        sc.close();
    }

    public static int search(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                return array[i];
            }
        }
        return -1;
    }
}
