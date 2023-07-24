package Library_of_Armenia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("You want to: 1) Return book 2) Report loss");
        library.action = scanner.nextInt();

        if (library.action == 1) {
            System.out.println("How many days of delay you have:");
            library.days_of_delay = scanner.nextInt();
            System.out.println("You wish to return: 1) Books 2) Magazines:");
            library.Return_of_books_or_magazines = scanner.nextInt();
            System.out.println("Number of books or magazines:");
            library.amount = scanner.nextInt();
            library.Payment_at_the_bookstore();
        } else if (library.action == 2) {
            System.out.println("Number of books or magazines to report loss:");
            library.amount = scanner.nextInt();
            int totalPayment = library.Payment_at_the_bookstore();
            System.out.println("Must pay $" + totalPayment);
        }
    }
}

