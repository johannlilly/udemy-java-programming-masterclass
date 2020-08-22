public class NumberOfDaysInMonth {
  public static boolean isLeapYear(int year) {
    return 0 < year && year < 10_000
      ? year % 4 == 0
        ? year % 100 == 0
          ? year % 400 == 0
            ? true
            : false
          : true
        : false
      : false
    ;
  }
  public static int getDaysInMonth(int month, int year) {
    return 
         month < 1 || month > 12
      || year < 1  || year >= 10_000
    ?  -1
    :    month == 1 
      || month == 3
      || month == 5
      || month == 7
      || month == 8
      || month == 10
      || month == 12
      ? 31
      :  month == 4
      || month == 6
      || month == 9
      || month == 11
        ? 30
        : month == 2 && isLeapYear(year)
          ? 29
          : 28;
  }
}