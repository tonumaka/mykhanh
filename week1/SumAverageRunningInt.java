public class SumAverageRunningInt{
    public static void main(String[] args){
        int sum = 0;
        double average;

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int count = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++){
            sum += number;
            count++;
        }
        average = (double) sum/count;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }
}