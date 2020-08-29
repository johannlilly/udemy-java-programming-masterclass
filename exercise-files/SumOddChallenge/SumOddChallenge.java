public class SumOddChallenge {
  public static void main(String[] args) {
    isOdd(-1);
    isOdd(1);
    sumOdd(0, 1);
    sumOdd(1, 0);
  }
  public static boolean isOdd(int number) {
    return ((number % 2 != 0) && (number >= 0));
  }
  public static int sumOdd(int start, int end) {
    if ((start >= 0) && (end >= start))  {
      int sum = 0;
      for (int i = start; i <= end; i++) {
        if(isOdd(i)) {
          sum += i;
        }
      }
      return sum;
    } else {
      return -1;
    }
  }
}