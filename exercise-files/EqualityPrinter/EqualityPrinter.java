public class IntEqualityPrinter {
  private static final String ERROR_MESSAGE = "Invalid Value";
  private static final String EQUALITY_MESSAGE = "All numbers are equal";
  private static final String INEQUALITY_MESSAGE = "All numbers are different";
  private static final String SEMI_EQUALITY_MESSAGE = "Neither all are equal or different";
  public static void printEqual(int a, int b, int c) {
    String equalityResult =  a < 0 || b < 0 || c < 0
    ? ERROR_MESSAGE
    : a == b && b == c
      ? EQUALITY_MESSAGE
      : a == b || b == c || a == c
        ? SEMI_EQUALITY_MESSAGE
        : INEQUALITY_MESSAGE;
    
    System.out.println(equalityResult);
  }
}