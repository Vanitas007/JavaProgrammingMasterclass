package s3_FirstSteps;

public class a028_Challenge_PrimitiveTypes {
    public static void main(String[] args) {

        byte myByte = Byte.MAX_VALUE - 1;
        short myShort = Short.MAX_VALUE - 1;
        int myInt = Integer.MAX_VALUE - 1;
        long myLong = 569056500600L + 10L * ((long) myByte + (long) myShort + (long) myInt);

        long longdsa = Long.MAX_VALUE;
        System.out.println(myLong);
        System.out.println(longdsa);

    }
}
