public class FibonacciInt {

    public static void main(String[] args) {
        printFibonacci();
    }

    public static void printFibonacci() {
        int fibo1 = 1;
        int fibo2 = 1;
        int fiboN = 0;
        System.out.println("F" + "(" + 0 + ")" + " = " + fibo1);
        System.out.println("F" + "(" + 1 + ")" + " = " + fibo2);
        int i = 2;
        while (true) {
            fiboN = fibo2 + fibo1;
            if (Integer.MAX_VALUE - fibo2 < fibo1) {
                System.out.println("F" + "(" + i + ")" + " is out of the range of int ");
                break;
            } else {
                System.out.println("F" + "(" + i + ")" + " = " + fiboN);

            }
            fibo1 = fibo2;
            fibo2 = fiboN;
            i++;
        }
    }
}
