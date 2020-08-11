public class Main {
  
  public static void main(String[] args) {
    
    byte challengeByte = 127;
    
    short challengeShort = 32767;
    
    int challengeInt = 2147483647;
    
    long challengeLong = 50000L + 10L * ((long) challengeByte + (long) challengeShort + (long) challengeInt);
    
    System.out.println(challengeLong);
  }
}
