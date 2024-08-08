import java.util.Objects;

public class TennisGame3 implements TennisGame {

    private int p1score;
    private int p2score;
    private String p1Name;
    private String p2Name;

    public TennisGame3(String p1Name, String p2Name) {
        this.p1Name = p1Name;
        this.p2Name = p2Name;
    }

    public String getScore() {
        String scoreOutput;
        if (p1score < 4 && p2score < 4 && !(p1score + p2score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            scoreOutput = p[p1score];
            return (p1score == p2score) ? scoreOutput + "-All" : scoreOutput + "-" + p[p2score];
        } else {
            if (p1score == p2score)
                return "Deuce";
            scoreOutput = p1score > p2score ? p1Name : p2Name;
            return ((p1score-p2score)*(p1score-p2score) == 1) ? "Advantage " + scoreOutput : "Win for " + scoreOutput;
        }
    }
    
    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, "player1"))
            this.p1score += 1;
        else
            this.p2score += 1;
        
    }

}
