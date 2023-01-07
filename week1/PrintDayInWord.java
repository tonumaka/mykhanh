import java.util.Scanner;

public class PrintDayInWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        
        if (dayNumber == 0){
            System.out.println("SUNDAY");
        } else if (dayNumber == 2){
            System.out.println("MONDAY");
        } else if (dayNumber == 3){
            System.out.println("TUESDAY");
        } else if (dayNumber == 4){
            System.out.println("WEDNESDAY");
        } else if (dayNumber == 5){
            System.out.println("THURSDAY");
        } else if (dayNumber == 6){
            System.out.println("FRIDAY");
        } else if (dayNumber == 7){
            System.out.println("SATURDAY");
        } else {
            System.out.println("not a valid day");
        }

        // using switch - case
        switch (dayNumber){
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            
            default:
            System.out.println("not a valid day");
        }
        sc.close();

    }
}