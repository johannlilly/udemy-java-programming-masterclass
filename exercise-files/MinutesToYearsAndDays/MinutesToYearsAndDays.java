public class MinutesToYearsDaysCalculator {
  public static void printYearsAndDays(long minutes) {
    String output = minutes < 0
      ? "Invalid Value"
      : minutes 
          + " min = " 
          + (int) Math.floor(minutes / 525600) 
          + " y and "
          + (int) Math.floor((minutes % 525600) / 1440)
          + " d";
    System.out.println(output);
  }
}