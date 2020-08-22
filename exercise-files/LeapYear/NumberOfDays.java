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
  // the compiler is very picky
  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12 || year < 1 || year >= 10_000) {return -1;}
    int daysInMonth;
    if (isLeapYear(year)) {
      switch(month) {
        case 2:
        daysInMonth = 29;
          break;
        case 4: case 6: case 9: case 11:
          daysInMonth = 30;
          break;
        default:
          daysInMonth = 31;
          break;
      }
    } else {
      switch(month) {
        case 2:
          daysInMonth = 28;
          break;
        case 4: case 6: case 9: case 11:
          daysInMonth = 30;
          break;
        default:
          daysInMonth = 31;
          break;  
      }
    }
    return daysInMonth;
  }
}