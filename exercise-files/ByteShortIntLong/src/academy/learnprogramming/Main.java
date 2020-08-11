// package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value  = " + myMinIntValue);
        System.out.println("Integer Maximum Value  = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // overflow

        // int myMaxIntTest = 2147483648; // Integer number too large
        int myLegibleInt = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L; // put letter "l" on the end, capitalized for legibility
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        // long bigLongLiteralValue = 2_147_483_647_234; // value too large without "L", treated as {int}
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767; // 32768 is invalid as the literal number cannot fit

        int myTotal = (myMinIntValue / 2);
        // invalid, as the variable is divided instead of the literal value. myMinByteValue is treated as {int}
        // byte myNewByteValue = (myMinByteValue / 2);
        // solution: cast
        byte myNewByteValue = (byte) (myMinByteValue / 2);
     
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
