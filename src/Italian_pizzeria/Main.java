package Italian_pizzeria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Italian_pizzeria_for_sale italian_pizzeria = new Italian_pizzeria_for_sale();

        System.out.println("Menu: 1) Pizza 2) Sandwiches 3) Salads");
        italian_pizzeria.menu = scanner.nextInt();
        System.out.println("Amount you want to order:");
        italian_pizzeria.Amount_you_want = scanner.nextInt();
        System.out.println("Want sauce: 1) Yes 2) No");
        italian_pizzeria.sauce = scanner.nextInt();

        italian_pizzeria.Pizza_Options_Menu();
    }
}
