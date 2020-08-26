public class CalculateInterest {

  private static final int[] CHALLENGE_NUMBERS = { 5, 6, 7, 8, 9, 10, 11, 12, 13 };

  public static void main(String[] args) {
    for (int i = 8; i >= 2; i--) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000d, (double) i)));
    }

    challengeLoop(CHALLENGE_NUMBERS);
  }
  
  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100d));
  }

  public static boolean isPrime(int n) {
 
    if (n == 1) return false;

    if (n == 2 || n == 3) return true;

    for (int i=2; i <= n/2; i++) {
      if(n % i == 0) {
        return false;
      }
    }

    return true;

  }

  public static void challengeLoop(int[] numbers) {
    
    int numberPrimesFound = 0;

    for(int i = 0; i < numbers.length; i++) {
      if (isPrime(numbers[i])) {
        if (++numberPrimesFound == 3) {
          System.out.println(numbers[i] + " is a prime number");
        } else {
          break;
        }
      }
    }

  }

}