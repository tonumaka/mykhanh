public class TwoSum{
    public static void main(String[] args){
        int oddSum = 0;
        int evenSum = 0;
        int absDiff;

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++){
            if (number % 2 == 0){
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        if (oddSum > evenSum){
            absDiff = oddSum - evenSum;
        } else {
            absDiff = evenSum - oddSum;
        }
        System.out.println(absDiff);
        
    }
}