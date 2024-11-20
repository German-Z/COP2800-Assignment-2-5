import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the subtotal and a gratuity rate: ");

        Scanner input = new Scanner(System.in);

        double subtotal = input.nextDouble();

        double gratuityRate = input.nextDouble() /100;

        double calculateGratuity = (gratuityRate * subtotal);

        double total = (calculateGratuity + subtotal);

        System.out.println("The gratuity is $" + calculateGratuity + " and total is $" + total);
    }
}
