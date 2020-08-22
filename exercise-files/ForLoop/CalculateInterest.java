public class CalculateInterest {
  public static void main(String[] args) {
    for (int i = 8; i >= 2; i--) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000d, (double) i)));
    }
  }
  
  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100d));
  }

  public static boolean isPrime(int n) {

    if (n == 1)  {
      return false;
    }

    for (int i=2; i <= n/2; i++) {
      if (n % 1 == 0) {
        return false;
      }
    }

    return true;
    
  }
}