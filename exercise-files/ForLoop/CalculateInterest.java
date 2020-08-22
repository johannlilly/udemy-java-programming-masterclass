public class CalculateInterest {
  public static void main(String[] args) {
    for (int i = 2; i <= 8; i++) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000d, (double) i)));
    }
  }
  
  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100d));
  }
}