public class TennisGame6 implements TennisGame {
    private final String player1Name;
    private final String player2Name;
    private int player1Score;
    private int player2Score;

    public TennisGame6(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score++;
        else
            player2Score++;
    }

    public String getScore()
    {
        if (player1Score == player2Score)
        {
            return determineTieScoreText(player1Score);
        }
        else if (player1Score >= 4 || player2Score >= 4)
        {
            return determineEndGameScore();
        }
        else
        {
            String score1 =  determineScoreText(player1Score);
            String score2 =  determineScoreText(player2Score);

            return score1 + "-" + score2;
        }

    }

    private String determineTieScoreText(int score){
        return switch (score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }

    private String determineEndGameScore() {
        if (player1Score - player2Score == 1) {
            return "Advantage " + player1Name;
        } else if (player1Score - player2Score == -1) {
            return "Advantage " + player2Name;
        } else if (player1Score - player2Score >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private String determineScoreText(int score) {
        return switch (score)
        {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };
    }
}
