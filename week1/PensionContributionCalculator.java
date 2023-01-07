package JavaBasic;

import java.util.Scanner;
public class PensionContributionCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        final int SALARY_CEILING = 6000;
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

        
        
        sc.close();
    }
}
