package OldPaperAns.Package1;

public class Match {
    private int oneDayMatch;
    private int testDayMatch;

   public Match(int oneMatches,int testMatches){
        this.oneDayMatch = oneMatches;
        this.testDayMatch = testMatches;
    }

    public int getOneDayMatches(){
        return oneDayMatch;
    }

    public int getTestDayMatches(){
        return testDayMatch;
    }
}
