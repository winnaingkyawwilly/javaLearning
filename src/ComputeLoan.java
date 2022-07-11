import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        //Declarations
        double loanAmount;
        double monthlyInterestRate = 0.004;
        int numberOfYear;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your loan Amount: ");
        loanAmount = input.nextDouble();

        System.out.println("Now Enter the time in years you would like to pay: ");
        numberOfYear = input.nextInt();

        //Data
        double monthlyPayment = (loanAmount*monthlyInterestRate)/(1 - 1/Math.pow((1 + monthlyInterestRate),(numberOfYear*12)));
        double totalPayment = monthlyPayment * numberOfYear * 12;

        System.out.println("Your Monthly Payment will be: " + (int)((monthlyPayment*100) + 0.5)/100 + " USD and total payment will be " + (int)((totalPayment*100) + 0.5)/100 + " USD")  ;

        input.close();
    }
}
