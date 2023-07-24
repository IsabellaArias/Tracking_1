package Consessionary_of_cars;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Consessionary consessionary= new Consessionary();

        System.out.println("you must enter a car brand between: 1) Chevrolet 2) Mazda and 3) Renault.");
        consessionary.brand=scanner.nextInt();

        consessionary.Information_and_Features();
    }
}
