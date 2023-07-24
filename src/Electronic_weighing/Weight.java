package Electronic_weighing;
import java.util.Scanner;

public class Weight {
    public int payment_Type;
    public int currency_Value;
    public int cost_Of_Service = 500;
    public int difference;

    public void process_For_Using_Pesa() {
        difference = currency_Value - cost_Of_Service;

        if (payment_Type == 1) {
            if (currency_Value == 500 || currency_Value == 1000) {
                display_Result();
            } else {
                System.out.println("Invalid coin value.");
            }
        } else if (payment_Type == 2) {
            if (currency_Value == 2000 || currency_Value == 5000) {
                display_Result();
            } else {
                System.out.println("Invalid banknote value.");
            }
        } else {
            System.out.println("Invalid payment type.");
        }
    }

    private void display_Result() {
        if (difference == 0) {
            System.out.println("Thank you for your payment. Have a nice day!");
        } else if (difference > 0) {
            System.out.println("Thank you for your payment. Your change is " + difference + " pesos. Have a nice day!");
        } else {
            System.out.println("Insufficient payment. You are missing " + Math.abs(difference) + " pesos.");
        }
    }
}