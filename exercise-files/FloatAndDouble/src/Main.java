public class Main {

    public static void main(String[] args) {

        // float = single precision, 32 bits; 1.4E-45 to 3.402..E+38
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue =  Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        // double = double precision, 64 bits; 4.9E-324 to 1.797...E+308
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue =  Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // 5.00 / 3.00
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 360d;
        double convertToKilograms = (double) numberOfPounds * 0.45359237d;
        System.out.println("Number of pounds in kilograms = " + convertToKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(convertToKilograms);

    }

}