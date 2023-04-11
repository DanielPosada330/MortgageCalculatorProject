import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        
        System.out.println("Welcome to your personal mortgage calculator. Please enter the principal amount: ");
        Double principalAmount = scanInput.nextDouble();
        
        System.out.println("\nPlease enter the annual interest rate: ");
        Float annualInterestRate = scanInput.nextFloat();
        
        System.out.println("\nTime period (in years): ");
        Float periodYears = scanInput.nextFloat();
        
        Float periodMonths = (periodYears*12);
        
        Float monthlyInterestRate = (annualInterestRate/1200);
        
        Double topEquation = (monthlyInterestRate*(Math.pow(1+monthlyInterestRate,periodMonths)));
        
        Double bottomEquation = (Math.pow(1+monthlyInterestRate,periodMonths)-1);
        
        Double mortgageAmount = principalAmount*(topEquation/bottomEquation);
        System.out.println("Your mortgage is: " + mortgageAmount + ".");
    }
}