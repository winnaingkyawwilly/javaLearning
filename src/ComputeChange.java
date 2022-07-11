import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        //Declaration
        double amount;
        int remainingAmount;

        //Scanner
        System.out.print("Please enter the amount of Dollars in decimals to divide the changes: ");
        Scanner input = new Scanner(System.in);
        amount = input.nextDouble();

        //Double to int conversion
        remainingAmount = (int)(amount*100);

        //Change Calculation

        int dollarAmount = remainingAmount/100;
        remainingAmount = remainingAmount%100;

        int centAmount = remainingAmount/25;
        remainingAmount = remainingAmount%25;

        int dimesAmount = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        int nickelsAmount = remainingAmount/5;
        remainingAmount = remainingAmount%5;

        int penniesAmount = remainingAmount;

        //Output
        System.out.println("The amount of " + amount + " can be divided as follows ");
        System.out.println("Dollars " + dollarAmount);
        System.out.println("Cents " + centAmount);
        System.out.println("Dimes " + dimesAmount);
        System.out.println("Nickels " + nickelsAmount);
        System.out.println("Pennies " + penniesAmount);

        input.close();
    }
}
