
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double score1;
        double score2;
        double score3;

        System.out.print("Enter first score: ");
        score1 = input.nextDouble();

        System.out.print("Enter second score: ");
        score2 = input.nextDouble();

        System.out.print("Enter third score: ");
        score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        input.close();
    }
}
