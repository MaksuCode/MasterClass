package practice;

public class ScoreCalculator {

    public int calculateFinalScore(int currentScore , int scoreAddedForEachLevel , int numberOfLevels){

        int ultimateScore = 10000;
        int finalScore = currentScore + (scoreAddedForEachLevel * numberOfLevels) ;
        int scoreToFinishTheGame = ultimateScore - finalScore ;
        boolean isGameOver = (finalScore >= 10000) ? true : false ;
        if (isGameOver){
            System.out.println("Game is over with a score of " +finalScore);
            return finalScore ;
        }else{
            System.out.println("You got " +finalScore+ " score on the game");
            System.out.println(scoreToFinishTheGame+ " more score needed to finish the game.");
            return finalScore ;
        }
    }

    public void displayHighScorePosition(String playerName , int position){
        System.out.println(playerName+ " managed to get into position "
                + position + " on the high score table.");
    }

    public int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000) return 1 ;
//        else if (playerScore >= 500) return 2 ;
//        else if (playerScore >= 100) return 3 ;
//        return 4 ;
        int position = 4 ; // This is another approach.
        if (playerScore >= 1000) position = 1 ;
        else if (playerScore >= 500) position = 2;
        else if (playerScore >= 100) position = 3 ;
        return position ;
    }











}
