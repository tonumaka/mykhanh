import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int size = sc.nextInt();

        int numRow = size;
        int numCol = size*2 -1;
        for (int row = 1; row <= numRow; row++){
            for (int col = 1; col <= numCol; col++){
                if ((col + row >= numRow + 1) && (col - row <= numRow - 1)){
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
