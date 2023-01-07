import java.util.Scanner;

public class SumProductMinMax3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int n3 = sc.nextInt();

        sc.close();

        int sum = n1 + n2 + n3;
        System.out.println("The sum is " + sum);

        int product = n1*n2*n3;
        System.out.println("The product is " + product);

        int min = n1;
        if (n2 < min){
            min = n2;
        }
        if (n3 < min){
            min = n3;
        }
        System.out.println("The min is " + min);

        int max = n1;
        if (n2 > max){
            max = n2;
        }
        if (n3 > max){
            max = n3;
        }
        System.out.println("The max is " + max);

        sc.close();
    }
}