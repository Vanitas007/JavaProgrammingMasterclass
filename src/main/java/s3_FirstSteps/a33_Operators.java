package s3_FirstSteps;

public class a33_Operators {
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


    }
}
