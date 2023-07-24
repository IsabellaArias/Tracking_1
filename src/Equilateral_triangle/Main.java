package Equilateral_triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Triangle triangle= new Triangle();

        System.out.println("Type side A:");
        triangle.side_A= scanner.nextFloat();

        System.out.println("Type side B:");
        triangle.side_B= scanner.nextFloat();

        System.out.println("Type side C:");
        triangle.side_c= scanner.nextFloat();

        triangle.triangle_check();
    }
}
