public class MethodOverloading {
  public static void main(String[] args) {
    int newScore = calculateScore("Tim", 500);
    System.out.println("New score is " + newScore);
    calculateScore(75); // calls appropriate method according to number of parameters
    calculateScore("Ash", 100);
    // calculateScore("Ash", 100, 200); // no method exists to handle three parameters
    calculateScore();

    System.out.println(calcFeetAndInchesToCentimeters(70));

  }
  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }
  public static int calculateScore(int score) {
    System.out.println("Unnamed player scored " + score + " points");
    return score * 1000;
  }
  public static int calculateScore() { // can't change data type
    System.out.println("No player name, no player score");
    return 0;
  }
  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    return
         feet >= 0
      && inches >=0
      && inches <=11
      ? ((feet * 12) + inches) * 2.54
      : -1
    ;
  }
  public static double calcFeetAndInchesToCentimeters(double inches) {
    return
      inches >= 0
      ? calcFeetAndInchesToCentimeters(
          Math.round(inches / 12),
          inches % 12
        )
      : -1;
  }
}