import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String input = sc.next();
        System.out.print("Enter the input radix: ");
        int inRadixSys = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadixSys = sc.nextInt();
        convert(input, inRadixSys, outRadixSys);
        sc.close();
    }

    public static void convert(String input, int inRadixSys, int outRadixSys) {
        if (isValid(input, inRadixSys)) {
            if (inRadixSys == 10) {
                System.out.print(input + " in radix " + inRadixSys + " is " +
                        convertDecToAny(input, outRadixSys) + " in radix " + outRadixSys);
            } else {
                if (outRadixSys == 10) {
                    System.out.printf(input + " in radix " + inRadixSys + " is " +
                            convertToDec(input, inRadixSys) + " in radix " + outRadixSys);
                } else {
                    String originalToDec = convertToDec(input, inRadixSys);
                    System.out.printf(input + " in radix " + inRadixSys + " is " +
                            convertDecToAny(originalToDec, outRadixSys) + " in radix " + outRadixSys);
                }
            }
        } else {
            System.out.println("Cannot convert");
        }
    }

    public static boolean isValid(String input, int inRadixSys) {
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            if (Character.digit(input.charAt(i), inRadixSys) == -1) {
                return false;
            }
        }
        return true;
    }

    public static String convertToDec(String input, int radixSys) {
        if (!isValid(input, radixSys)) {
            return null;
        }
        long decValue = 0;
        for (int i = 0; i < input.length(); i++) {
            decValue = decValue * radixSys + Character.digit(input.charAt(i), radixSys);
        }
        return Long.toString(decValue);
    }

    public static String convertDecToAny(String inDec, int outRadixSys) {
        StringBuilder otherBase = new StringBuilder();
        long decValue = Long.parseLong(inDec);
        while (decValue > 0) {
            long remainder = decValue % outRadixSys;
            otherBase.append(Integer.toUnsignedString((int) remainder, outRadixSys));
            decValue /= outRadixSys;
        }
        return otherBase.reverse().toString();
    }
}
