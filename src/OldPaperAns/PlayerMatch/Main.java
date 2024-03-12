package OldPaperAns.PlayerMatch;
import OldPaperAns.Package1.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Dev", "India");
        Run run = new Run(100, 85);
        Match match = new Match(2, 3);

        double average = calculateAvg(run, match);

        System.out.println("Player Name : " + player.getName());
        System.out.println("Player Team : " + player.getTeamName());
        System.out.println("Number of One Day match Played : " + match.getOneDayMatches());
        System.out.println("One Day Match Score : " + run.getOneDayMatchRuns());
        System.out.println("Number of Test match Played : " + match.getTestDayMatches());
        System.out.println("Test Match Score : " + run.getTestMAtchRuns());
        System.out.println("Average Score : " + average);
    }

    private static double calculateAvg(Run run, Match match) {
        int totalrun = run.getTestMAtchRuns() + run.getOneDayMatchRuns();
        int totalmatch = match.getOneDayMatches() + match.getTestDayMatches();
        return (double) totalrun / totalmatch;
    }
}
