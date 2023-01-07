import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int NUM_ITEMS;
        int[] items;
        
        do {
            System.out.print("Enter the number of items: "); 
            NUM_ITEMS = sc.nextInt();
        } while (NUM_ITEMS <= 0);

        items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space):  ");
        if (items.length > 0){
            for (int i = 0; i < items.length; i++){
                items[i] = sc.nextInt();
            }
            System.out.print("The value are: ");
            for (int i = 0; i < items.length; i++){
                if (items.length != 1){
                    if (i == 0){
                        System.out.print("[" + items[i] +", ");
                    } else {
                        if (i == items.length - 1){
                            System.out.print(items[i] + "]");
                        } else {
                            System.out.print(items[i] + ", ");
                        }
                    }
                }
                if (items.length == 1){
                    System.out.println("[" + items[i] + "]");
                }
            }
        }
        sc.close();
    }
}