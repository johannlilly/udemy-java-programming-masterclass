public class Main {
  
  public static void main(String[] args) {

    printConversion(2);

  }

  public static long toMilesPerHour(double kilometersPerHour) {
  
    double milesPerHour = 
      0 <= kilometersPerHour
        ? Math.round(kilometersPerHour / 1.609)
        : -1;

    return (long) milesPerHour;
    
  }

  public static void printConversion(double kilometersPerHour) {
  
    long milesPerHour = toMilesPerHour(kilometersPerHour);
      
    System.out.println(
      milesPerHour == -1
        ? "Invalid Value"
        : kilometersPerHour + " km/h = " + milesPerHour + " mi/h"
    );

  }

}