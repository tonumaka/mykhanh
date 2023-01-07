import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--){
            System.out.print(inStr.charAt(charIdx));
        }       
        sc.close();
    }
}
