public class Switch {
    public static void main(String[] args) {
      int value = 1;
      if (value == 1) {
        System.out.println("Value was 1");
      } else if (value == 2) {
        System.out.println("Value was 2");
      } else {
        System.out.println("Value was not 1 or 2");
      }

      int switchValue = 3;

      switch(switchValue) {
        case 1:
          System.out.println("Value was 1 ");
          break;

        case 2:
          System.out.println("Value was 2");
          break;

        case 3:case 4:case 5:
          System.out.println("Value was 3, 4, or 5");
          System.out.println("Actually it was a " + switchValue);
          break;

        default:
          System.out.println("Value was not 1 or 2");
          break;
      }

      // more code here, where program continues after {break}

      char switchChallengeValue = "A";

      switch(switchChallengeValue) {
        case "A":
          System.out.println("The value is A");
          break;
        case "B":
          System.out.println("The value is B");
          break;
        case "C": case "D" : case "E":
          System.out.println("The value is " + switchChallengeValue);
          break;
        default:
          System.out.println("Not found");
          break;
      }

      String month = "January";
      switch(month.toLowerCase()) {
        case "january":
          System.out.println("Jan");
          break;
        case "june":
          System.out.println("Jun");
          break;
        default:
          System.out.println("Not sure");
          break;
      }

    }
}