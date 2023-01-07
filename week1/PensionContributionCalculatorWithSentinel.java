package JavaBasic;
import java.util.Scanner;
public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the monthly salary (or -1 to end): $");
        int salary = in.nextInt();

        while (salary != -1){
            System.out.println("Enter the age: ");
            int age = in.nextInt();
            final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
            final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
            final double EMPLOYEE_RATE_55_TO_60 = 0.13;
            final double EMPLOYER_RATE_55_TO_60 = 0.13;
            final double EMPLOYEE_RATE_60_TO_65 = 0.075;
            final double EMPLOYER_RATE_60_TO_65 = 0.09;
            final double EMPLOYEE_RATE_65_ABOVE = 0.05;
            final double EMPLOYER_RATE_65_ABOVE = 0.075;
            
            double employeeContribution;
            double employerContribution;
            double totalContribution;

            if (age <= 55){
                employeeContribution = (double) EMPLOYEE_RATE_55_AND_BELOW * salary;
                employerContribution = (double) EMPLOYER_RATE_55_AND_BELOW * salary;
                System.out.println("The employee's contribution is: " + employeeContribution);
                System.out.println("The employer's contribution is: " + employerContribution);
                totalContribution = employeeContribution + employerContribution;
                System.out.println("The employer's contribution is: " + totalContribution);
            } else if (age <= 60) {
                employeeContribution = (double) EMPLOYEE_RATE_55_TO_60 * salary;
                employerContribution = (double) EMPLOYER_RATE_55_TO_60 * salary;
                System.out.println("The employee's contribution is: " + employeeContribution);
                System.out.println("The employer's contribution is: " + employerContribution);
                totalContribution = employeeContribution + employerContribution;
                System.out.println("The employer's contribution is: " + totalContribution);
            } else if (age <= 65) {
                employeeContribution = (double) EMPLOYEE_RATE_60_TO_65 * salary;
                employerContribution = (double) EMPLOYER_RATE_60_TO_65 * salary;
                System.out.println("The employee's contribution is: " + employeeContribution);
                System.out.println("The employer's contribution is: " + employerContribution);
                totalContribution = employeeContribution + employerContribution;
                System.out.println("The employer's contribution is: " + totalContribution);
            } else {
                employeeContribution = (double) EMPLOYEE_RATE_65_ABOVE * salary;
                employerContribution = (double) EMPLOYER_RATE_65_ABOVE * salary;
                System.out.println("The employee's contribution is: " + employeeContribution);
                System.out.println("The employer's contribution is: " + employerContribution);
                totalContribution = employeeContribution + employerContribution;
                System.out.println("The employer's contribution is: " + totalContribution);
            }
            System.out.println("Enter the monthly salary (or -1 to end): $");
            int salary = in.nextInt();
        }
        
    }
}
