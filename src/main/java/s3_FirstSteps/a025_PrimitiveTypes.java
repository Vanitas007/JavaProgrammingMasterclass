package s3_FirstSteps;

public class a025_PrimitiveTypes {
    public static void main(String[] args) {

        int myValue = 10000;

        //32 bits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value " + myMinIntValue);
        System.out.println("Integer max value " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 2));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        // 26.

        //8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //64 bits
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long maxlong = 9_223_372_036_854_775_807L;
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        // 27.
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);


    }
}
