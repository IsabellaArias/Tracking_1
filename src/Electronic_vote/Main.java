package Electronic_vote;

public class Main {
    public static void main(String[] args) {
        Vote voteSystem = new Vote();
        voteSystem.collect_Votes();
        voteSystem.show_Results();
    }
}