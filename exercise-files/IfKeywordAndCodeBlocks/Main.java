public class Main {
  public static void main (String[] args) {

    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    // skipped codeblock for single statement
    if (score == 5000) System.out.println("Your score was " + score);

    // if (score < 5000 && score > 1000) {
    //   System.out.println("Your score was less than 5000 but greater than 1000");
    // } else if (score < 1000) {
    //   System.out.println("Your score was less than 1000");
    // } else {
    //   System.out.println("Got here");
    // }

    if (gameOver) {
      // this variable cannot be accessed outside of its code block
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your final score was " + finalScore);
    }

    score = 10_000;
    levelCompleted = 8;
    bonus = 200;

    if (gameOver) {
      // this variable cannot be accessed outside of its code block
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }

  }
}