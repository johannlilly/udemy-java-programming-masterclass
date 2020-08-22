public class Main {

  public static void main(String[] args) {

    System.out.println(getDurationString(128));

  }

  // Return hours, minutes, and seconds
  public static String getDurationString(int minutes, int seconds) {

    return !(minutes >= 0)
    ? "Invalid value"
    : !(minutes >= 0 && seconds >= 0 && seconds < 60)
      ? "Invalid value"
      // XXh YYm ZZs
      : (int) Math.floor(minutes / 60) + "h " + minutes % 60 + "m " + seconds + "s";

  }

  public static String getDurationString(int seconds) {

    return !(seconds >= 0)
    ? "Invalid value"
    : getDurationString((int) Math.floor(seconds / 60) , seconds % 60);

  }

}