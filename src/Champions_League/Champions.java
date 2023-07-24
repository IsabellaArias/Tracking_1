package Champions_League;

public class Champions {
    public String team_name_1;
    public String team_name_2;
    public int scoreboard_1;
    public int scoreboard_2;
    public String date_1;
    public String date_2;
    public String date_3;
    public int team1TotalScore;
    public int team2TotalScore;
    public void calculate_Ranking() {
        team1TotalScore = scoreboard_1;
        team2TotalScore = scoreboard_2;
    }

    public void dates() {
        System.out.println("The first date is: " + date_1);
        System.out.println("The second date is: " + date_2);
        System.out.println("The third date is: " + date_3);
    }

    public void show_Ranking() {
        System.out.println("Ranking of teams:");
        System.out.println(team_name_1 + ": " + team1TotalScore + " points");
        System.out.println(team_name_2 + ": " + team2TotalScore + " points");
    }
}
