package Sale_of_Stikers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Stikers stikers= new Stikers();

        System.out.println("Select the size of the stikers: 1) Small 2) Large");
        stikers.Size_of_the_Stikers=scanner.nextInt();
        System.out.println("Indicate the number of stikers you want");
        stikers.Number_of_Stikers=scanner.nextInt();
        stikers.Calculate_the_cost_of_stikers();
    }
}


