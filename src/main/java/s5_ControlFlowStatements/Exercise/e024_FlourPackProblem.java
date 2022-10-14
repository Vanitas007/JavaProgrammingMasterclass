package s5_ControlFlowStatements.Exercise;

public class e024_FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(50, 65, 265));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }
}


//public class FlourPacker {
//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        int bigCountToUse = bigCount < goal/5 ? bigCount : goal/5;
//        return (goal - bigCountToUse*5) <= smallCount;
//    }
//}



