public class WhileDoWhile {
  public static void main(String[] args) {
    int count = 0;
    while (count != 5) {
      System.out.println("Count value is " + count);
      count++;
    }

    for (int i = 0; i != 5; i++) {
      System.out.println("Count value is " + i);
    }
  }
}