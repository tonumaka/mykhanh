package JavaBasic;
import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inNumber = in.nextInt();
        int inDigit;

        while (inNumber > 0){
            inDigit = inNumber % 10;
            System.out.println(inDigit);
            inNumber /= 10;
        }
    }
}
