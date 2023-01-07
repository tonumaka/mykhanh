import java.util.Scanner;

public class Exponent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int exp;
        int base;

        System.out.print("Enter the base: ");
        base = sc.nextInt();
        
        do {
            System.out.print("Enter the exponet: ");
            exp = sc.nextInt();
        } while (exp < 0);

        sc.close();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
   }
   

    public static int exponent(int base, int exp){
        int product = 1;
        
        for (int i = 0; i < exp; i++){
            product *= base;
        }

        return product;
    }

    
}
