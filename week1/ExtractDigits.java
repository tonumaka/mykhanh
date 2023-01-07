public class ExtractDigits{
    public static void main(String[] args){
        int n = 12345;
        
        while (n > 0){
            int k = n % 10;
            System.out.print(k + " ");
            n = n/10;
        }
    }
}