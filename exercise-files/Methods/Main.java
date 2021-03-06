public class Main {
  
  public static void main (String[] args) {

    boolean gameOver = true;
    String name;
    int score;
    int levelCompleted;
    int bonus;
    int highScore;

    // Player 1

    name = "Ash";
    score = 800;
    levelCompleted = 5;
    bonus = 100;

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + highScore);

    displayHighScorePosition(
      name, 
      calculateHighScorePosition(highScore)
    );

    // Player 2

    name = "Blue";
    score = 10_000;
    levelCompleted = 8;
    bonus = 200;

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + highScore);
    
    displayHighScorePosition(
      name, 
      calculateHighScorePosition(highScore)
    );

  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2_000;
      return finalScore;
    }

    return -1;

  }

  public static void displayHighScorePosition(String name, int position) {

    System.out.println("Player " + name + " managed to get into position " + position + " on the high score table");

  }

  public static int calculateHighScorePosition(int score) {

    int position =
      score >= 1000 ? 1 :
      score >= 500  ? 2 :
      score >= 100  ? 3 :
      4;
    
    return position;

  }

}