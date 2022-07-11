import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        //Declaration
        double a;
        double b;
        double c;
        double x;

        //Scanner
         Scanner input = new Scanner(System.in);
         System.out.println("Please Enter the respective a b c values separated by space ");
         a = input.nextDouble();
         b = input.nextDouble();
         c = input.nextDouble();

         //Calculation
         x = - b/2*a + Math.sqrt(Math.pow(b,2) - 4*a*c)/2*a ;

         System.out.println("The value for X is: " + x);

    }
}
