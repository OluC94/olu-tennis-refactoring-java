import java.util.Objects;

public class TennisGame3 implements TennisGame {

    private int p1score;
    private int p2score;
    private final String p1Name;
    private final String p2Name;

    public TennisGame3(String p1Name, String p2Name) {
        this.p1Name = p1Name;
        this.p2Name = p2Name;
    }

    public String getScore() {
        boolean isGamePreDeuce = p1score < 4 && p2score < 4 && !(p1score + p2score == 6);

        if (isGamePreDeuce) {
            return determineScoreOutput();
        }

        if (p1score == p2score) {
            return "Deuce";
        }

        String leadingPlayer = p1score > p2score ? p1Name : p2Name;

        boolean isAdvantage = (p1score-p2score)*(p1score-p2score) == 1;

        return isAdvantage ? "Advantage " + leadingPlayer : "Win for " + leadingPlayer;

    }

    private String determineScoreOutput(){
        String[] possibleScores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String p1ScoreString = possibleScores[p1score];
        String p2ScoreString = possibleScores[p2score];

        boolean isScoreLevel = p1score == p2score;
        String levelScores = p1ScoreString + "-All";
        String nonLevelScores = p1ScoreString + "-" + p2ScoreString;

        return isScoreLevel ? levelScores : nonLevelScores;
    }


    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, "player1"))
            p1score++;
        else
            p2score++;
    }

}
