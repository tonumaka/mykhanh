import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hex string: ");
        String inStr = sc.next();

        int count = 0;
        int inStrLen = inStr.length();
        for (int charIdx = 0; charIdx < inStrLen; charIdx++){
            char inChar = inStr.charAt(charIdx);
            if ((inChar < '0' || inChar > '9') && (inChar < 'A' || inChar > 'F') && (inChar < 'a' || inChar > 'f')){
                count++;
                
            } 
        }
        if (count == 0){
            System.out.println(inStr + " is a hex string");
        } else {
            System.out.println(inStr + " is NOT a hex string");
        }
        sc.close();
    }
}
