public class Main {

  private static final String INVALID_VALUE_MESSAGE = "Invalid value";
  public static void main(String[] args) {

    System.out.println(getDurationString(128));

  }

  // Return hours, minutes, and seconds
  public static String getDurationString(int minutes, int seconds) {

    return !(minutes >= 0)
    ? INVALID_VALUE_MESSAGE
    : !(minutes >= 0 && seconds >= 0 && seconds < 60)
      ? INVALID_VALUE_MESSAGE
      // XXh YYm ZZs
      : minutes >= 0 && minutes < 10
        ? (int) Math.floor(minutes / 60) + "h 0" + minutes % 60 + "m " + seconds + "s"
        : (int) Math.floor(minutes / 60) + "h " + minutes % 60 + "m " + seconds + "s";

  }

  public static String getDurationString(int seconds) {

    return seconds >= 0
    ? getDurationString((int) Math.floor(seconds / 60) , seconds % 60)
    : INVALID_VALUE_MESSAGE;

  }

}