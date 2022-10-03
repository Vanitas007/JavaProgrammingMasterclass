package s5_ControlFlowStatements.Challenge;

public class a064_DayOfTheWeek {
    public static void main(String[] args) {

        printDayOfTheWeek(4);
        printDayOfTheWeekIF(5);
    }

    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

// Git opcja
    public static void printDayOfTheWeekIF(int day) {
        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day < daysOfTheWeek.length)
            System.out.println("Today is " + daysOfTheWeek[day]);
        else
            System.out.println("Invalid Value");
    }
}


//    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//        The method should not return any value (hint: void)
//        Using a switch statement print Sunday, Monday, Saturday
//        if the int parameter day is 0, 1, , 6 respectively, otherwise it should print Invalid day.
//        Bonus:
//        Write a second solution using if then else, instead of using switch.
//        Create a new project in IntelliJ with the  name DayOfTheWeekChallenge