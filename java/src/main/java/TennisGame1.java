
public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            return determineDrawingText();

        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score-player2Score;

            if (minusResult == 1) {
                score = "Advantage " + player1Name;
            } else if (minusResult == -1) {
                score = "Advantage " + player2Name;
            } else if (minusResult >= 2) {
                score = "Win for " + player1Name;
            } else {
                score = "Win for " + player2Name;
            }

        } else {
            for (int i=1; i<3; i++) {
                if (i==1) {
                    tempScore = player1Score;
                }
                else {
                    score += "-"; tempScore = player2Score;
                }
                switch (tempScore)
                {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private String determineDrawingText() {
        return switch (player1Score)
        {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }
}
