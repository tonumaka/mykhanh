import java.util.Scanner;

public class ReverseArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;

        System.out.print("Enter the size: ");
        size = sc.nextInt();

        array = new int[size];

        System.out.print("Enter the array: ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        sc.close();

        
        reverse(array);
        
    }

    public static void reverse(int[] array){
        for (int i = 0, j = array.length - 1; i < j; i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
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
}
