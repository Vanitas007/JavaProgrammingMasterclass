package s3_FirstSteps;

public class a029_FloatAndDouble {

    public static void main(String[] args) {


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min Value " + myMinFloatValue);
        System.out.println("float max value " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min Value " + myMinDoubleValue);
        System.out.println("double max value " + myMaxDoubleValue);


//        int myIntValue = 5;
//        float myFloatValue = 5.25f;
//        double myDoubleValue = 5.25d;

        //30.

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00d / 3.00d;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);


        double numberOfPounds = 5.5d;
        double poundToKilogram = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms to pounds= " + poundToKilogram);


        double pi = Math.PI;
        double anotherNumber = 3000000.4567890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
