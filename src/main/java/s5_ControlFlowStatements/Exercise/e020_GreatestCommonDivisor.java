package s5_ControlFlowStatements.Exercise;

public class e020_GreatestCommonDivisor {
    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            for (int smallerValue = Math.min(first, second); smallerValue > 0; smallerValue--) {
                if (first % smallerValue == 0 && second % smallerValue == 0) {
                    return smallerValue;
                }
            }
        }
        return -1;
    }
}

    // lepsze rozwiązanie z neta
//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first >= 10 && second >= 10) {
//            while (first != second) {
//                if (first > second)
//                    first -= second;
//                else {
//                    second -= first;
//                }
//            }
//            return second;
//        }
//        return -1;
//    }
//}