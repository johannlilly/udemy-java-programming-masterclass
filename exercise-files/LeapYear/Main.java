public class Main {
  public static void main(String[] args) {
    isLeapYear(1700);
    isLeapYear(1800);
    isLeapYear(1900);

    isLeapYear(1600);
    isLeapYear(2000);
    isLeapYear(2400);
  }
  public static boolean isLeapYear(int year) {
    return 0 < year && year < 10_000
      ? year % 4 == 0
        ? year % 100 == 0
          ? year % 400 == 0
            ? true // year is divisible by 4, 100, and 400
            : false // year is divisible by 4 and 100, but not by 400
          : true // year is divisible by 4 but not by 100
        : false // year is not divisible by 4
      : false // invalid year
    ;
  }
}