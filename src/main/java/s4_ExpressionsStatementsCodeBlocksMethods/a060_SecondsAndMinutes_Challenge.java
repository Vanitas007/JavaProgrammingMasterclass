package s4_ExpressionsStatementsCodeBlocksMethods;

import java.text.DecimalFormat;

public class a060_SecondsAndMinutes_Challenge {


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes = minutes % 60;

        DecimalFormat decForm = new DecimalFormat("00");
        String result = decForm.format(hours)+ "h " + decForm.format(minutes) + "m " + decForm.format(seconds) + "s";

        System.out.println(result);
        return result;
    }


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
