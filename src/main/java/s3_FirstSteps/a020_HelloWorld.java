package s3_FirstSteps;

public class a020_HelloWorld {

    public static void main(String[] args) {

        String hello = "Hello World";
        System.out.println(hello);

        int number = (10 + 5) + (2 * 10);
        System.out.println(hello + " " + number);

        int mySecondNumber = 12;
        int myThirddNumber = number * 2;
        int myTotal = (mySecondNumber + myThirddNumber + number);
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    }
}
