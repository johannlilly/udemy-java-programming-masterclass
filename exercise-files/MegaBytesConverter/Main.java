public class Main {
  public static void main(String[] args) {

  }
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    int megaBytes = Math.round(kiloBytes / 1024);
    System.out.println(
      0 <= kiloBytes
      ? kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes % 1024 + " KB"
      : "Invalid Value"
    );
  }
}