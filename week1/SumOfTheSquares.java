public class SumOfTheSquares{
    public static void main(String[] args){
        int sum = 0;

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++){
            sum += number*number;
        }
        System.out.println("The sum of squares 1 to 100 is " + sum);
    }
}