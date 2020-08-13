public class Main {
  public static void main(String[] args) {

  }
  public static boolean hasTeen(int num0, int num1, int num10)  {
    return
         isTeen(num0)
      || isTeen(num1)
      || isTeen(num10)
    ;
  }
  public static boolean isTeen(int num0) {
    return 13 <= num0 && num0 <= 19;
  }
}