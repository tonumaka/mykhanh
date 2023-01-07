import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();
        for (int charIdx = 0; charIdx < inStrLen; charIdx++){
            switch (inStr.toLowerCase().charAt(charIdx)){
                case 'a':
                case 'b':
                case 'c':
                    System.out.print("2");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print("3");
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print("4");
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print("5");
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print("6");
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.println("7");
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.println("8");
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.println("9");
                    break;
                case ' ':
                    System.out.println(" ");
                    break;
            }
        }

        sc.close();
    }
}
