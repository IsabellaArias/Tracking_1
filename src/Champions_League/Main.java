package Champions_League;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Champions champions= new Champions();

        System.out.println("Enter a name for the first team: ");
        champions.team_name_1 = scanner.next();

        System.out.println("Enter a marker for the first team: ");
        champions.scoreboard_1 = scanner.nextInt();

        System.out.println("Enter a name for the second team: ");
        champions.team_name_2 = scanner.next();

        System.out.println("Enter a marker for the second team: ");
        champions.scoreboard_2 = scanner.nextInt();

        System.out.println("Enter date number 1: ");
        champions.date_1 = scanner.next();

        System.out.println("Enter date number 2: ");
        champions.date_2 = scanner.next();

        System.out.println("Enter date number 3: ");
        champions.date_3 = scanner.next();

        champions.calculate_Ranking();
        champions.dates();
        champions.show_Ranking();
    }
}
