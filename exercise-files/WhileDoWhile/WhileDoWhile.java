public class WhileDoWhile {
  public static void main(String[] args) {
    int number = 4;
    int finishNumber = 20;

    while (number <= finishNumber) {
      number++;

      if (!isEvenNumber(number)) {
        continue; // bypass any code following this `if` code block and return to the while loop
      }

      System.out.println("Even number " + number);
    }
  }
  public static boolean isEvenNumber(int number) {
    return ((number % 2) == 0 && (number >= 0));
  }
}