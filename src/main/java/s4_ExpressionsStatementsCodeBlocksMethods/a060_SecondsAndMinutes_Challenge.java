package s4_ExpressionsStatementsCodeBlocksMethods;

import java.text.DecimalFormat;

public class a060_SecondsAndMinutes_Challenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        DecimalFormat decForm = new DecimalFormat("00");
        //powyższa linijka = to co w komentarzu.
//        String hoursString = hours + "h ";
//        if (hours < 10) {
//            hoursString = "0" + hoursString;
//        }
//        String minutesString = hours + "h ";
//        if (remainingMinutes < 10) {
//            hoursString = "0" + minutesString;
//        }
//        String secondsString = hours + "h ";
//        if (seconds < 10) {
//            hoursString = "0" + secondsString;
//        }

        return decForm.format(hours) + "h " + decForm.format(remainingMinutes) + "m " + decForm.format(seconds) + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
