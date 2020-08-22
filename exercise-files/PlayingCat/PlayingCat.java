public class PlayingCat {
  private static final short SAFE_LOW_TEMP = 25;
  private static final short SAFE_HIGH_TEMP = 35;
  private static final short SAFE_HIGH_TEMP_SUMMER = 45;
  public static boolean isCatPlaying(boolean summer, int temperature) {
    return summer
    ? SAFE_LOW_TEMP <= temperature && temperature <= SAFE_HIGH_TEMP_SUMMER
    : SAFE_LOW_TEMP <= temperature && temperature <= SAFE_HIGH_TEMP;
  }
}