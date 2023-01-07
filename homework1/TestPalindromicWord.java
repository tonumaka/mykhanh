import java.util.Scanner;

public class TestPalindromicWord {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String inStr = sc.nextLine().toLowerCase();
        int inStrLen = inStr.length();
        String reverse = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            reverse = reverse + inStr.charAt(charIdx);
        }
        if (inStr.equals(reverse)) {
            System.out.println(inStr + " is a palindrome word");
        } else {
            System.out.println(inStr + " is not a palindrome word");
        }
        sc.close();
    }
}