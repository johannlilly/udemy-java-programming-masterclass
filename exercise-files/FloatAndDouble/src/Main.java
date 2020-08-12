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

        int myIntValue = 5;
        float myFloatValue = 5.25f; // or (float) 5.25; assumed to be a double so need to cast; not recommended
        double myDoubleValue = 5d; // default when you have a decimal; double is best practice

    }

}