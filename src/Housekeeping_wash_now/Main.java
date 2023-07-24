package Housekeeping_wash_now;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Wash_now washNow= new Wash_now();

        System.out.println("What service you want: 1) Washing 2) Ironing");
        washNow.type_of_service= scanner.nextInt();
        System.out.println("How many clothes?");
        washNow.Quantity_of_Garments=scanner.nextInt();
        washNow.Services();
    }
}
