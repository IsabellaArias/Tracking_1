package Electronic_weighing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Weight weight = new Weight();

        System.out.println("Enter the payment type (1 for coin, 2 for banknote): ");
        weight.payment_Type = scanner.nextInt();

        System.out.println("Enter the payment value: ");
        weight.currency_Value = scanner.nextInt();

        weight.process_For_Using_Pesa();
    }
}
