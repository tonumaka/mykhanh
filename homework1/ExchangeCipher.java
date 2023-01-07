import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();
        System.out.print("The ciphertext string is: ");
        for (int charIdx = inStrLen -1 ; charIdx >= 0; charIdx--){
            
            System.out.print(inStr.toUpperCase().charAt(charIdx));
        }

        sc.close();
    }
}
