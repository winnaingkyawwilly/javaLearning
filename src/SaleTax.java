import java.util.Scanner;

public class SaleTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the amount you shopped: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;

        //(int) narrow the double to int -> then multiply 100 to get 2 decimal then divide 100 to create floats
        System.out.println("Your Sale Tax is :" + (int)( tax * 100 )/100.0);

        input.close();

    }
}
