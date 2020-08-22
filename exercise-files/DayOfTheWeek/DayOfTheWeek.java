public class DayOfTheWeek {
  private static final String DAY_ERROR = "Invalid day (must be within range 0 - 6)";
  public static void printDayOfTheWeek(int day) {

    switch (day) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println(DAY_ERROR);
    }

    // using if/else

    System.out.println(day == 0
    ? "Sunday"
    : today == 1
      ? "Monday"
      : today == 2
        ? "Tuesday"
        : today == 3
          ? "Wednesday"
          : today == 4
            ? "Thursday"
            : today == 5
              ? "Friday"
              : today == 6
                ? "Saturday"
                : "Invalid day"
    );
  }
}