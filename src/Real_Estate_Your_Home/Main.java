package Real_Estate_Your_Home;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Your_Home yourHome= new Your_Home();
        System.out.println("Enter the cost of the house:");
        yourHome.cost_of_the_house=scanner.nextFloat();
        System.out.println("Enter the type of property (1. Used 2. New)");
        yourHome.type_of_property=scanner.nextInt();
        yourHome.calculate_the_commission();
        yourHome.Show_money_that_the_user_receives();
    }
}
