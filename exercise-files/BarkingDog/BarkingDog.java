public class BarkingDog {
  public static void main(String[] args) {
    shouldWakeUp(true, 1);
    shouldWakeUp(false, 2);
    shouldWakeUp(true, 8);
    shouldWakeUp(true, -1);
  }
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    boolean wakeUp = 
      0 <= hourOfDay && hourOfDay < 24
        ? barking
          ? hourOfDay < 8 || 23 == hourOfDay
            ? true  // dog barking, right hour
            : false // dog barking, wrong hour
          : false // valid input, dog not barking
        : false // invalid input
      ;
    return wakeUp;
  }
}