import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantity;
        double unitPrice;

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}