package s3_FirstSteps;

public class a033_Operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResoult = result;
        System.out.println("prevoiusResoult = " + previousResoult);
        result = result - 1;
        System.out.println("3-1= " + result);
        System.out.println("prevoiusResoult = " + previousResoult);

        result = result * 10; //2*10=20
        System.out.println("2*10= " + result);

        result = result / 5; //20/5=4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // reszta z dzielenia (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++;   //1+1=2
        System.out.println("1+1= " + result);

        result--;   //2-1=1
        System.out.println("1-1= " + result);

        result += 2;    //result = result +2
        System.out.println("1+2= " + result);

        result *= 10;    // result = result *10
        System.out.println("3*10= " + result);

        result /= 3;    //result = result/3
        System.out.println("30/3= " + result);

        result -= 2;    //result=result-2;
        System.out.println("10-2= " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not and alien!");
            System.out.println("An I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the hish score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;      //zmienna wasCar równa się isCar? tak i działa, false i nie działa

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // 40. Challenge

        double doubleFirstVariable = 20.00d;
        double doubleSecondVariable = 80.00d;
        double sumAndMultiplyVariable = (doubleFirstVariable + doubleSecondVariable) * 100.00d;
        int remainderVariable = (int) sumAndMultiplyVariable % 40;
        boolean step5 = (remainderVariable == 0) ? true : false;
        System.out.println("Stem5 result is: " + step5);
        if (!step5) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("remainderVariable is: " + remainderVariable);
        }


    }
}
