package Multiplication_tables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tables tables= new Tables();

        System.out.print("Enter the multiplication table number you want to print: ");
        tables.table_number= scanner.nextInt();

        tables.Print_Table();

    }
}