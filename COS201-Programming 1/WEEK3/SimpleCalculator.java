
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber;
        double secondNumber;

        System.out.print("Enter first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        secondNumber = input.nextDouble();

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (secondNumber != 0) {
            double division = firstNumber / secondNumber;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        input.close();
    }
}
