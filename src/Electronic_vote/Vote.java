package Electronic_vote;

import java.util.Scanner;

public class Vote {
    public int votesForCandidate1;
    public int votesForCandidate2;
    public int vote;

    public void collect_Votes() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Voter " + i + ", please choose your candidate 1) for Ana Maria Suarez or 2) for Diego Acero:");
            vote = scanner.nextInt();
            if (vote == 1) {
                votesForCandidate1++;
            } else if (vote == 2) {
                votesForCandidate2++;
            } else {
                System.out.println("Invalid vote. Please vote again.");
                i--;
            }
        }
    }

    public void show_Results() {
        System.out.println("Total votes for Ana Maria Suarez: " + votesForCandidate1);
        System.out.println("Total votes for Diego Acero: " + votesForCandidate2);

        if (votesForCandidate1 > votesForCandidate2) {
            System.out.println("The winner is Ana Maria Suarez!");
            System.out.println("The loser is Diego Acero.");
        } else if (votesForCandidate1 < votesForCandidate2) {
            System.out.println("The winner is Diego Acero!");
            System.out.println("The loser is Ana Maria Suarez.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

