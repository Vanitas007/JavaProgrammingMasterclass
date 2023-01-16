package s9_Arrays.Challenge;

import java.util.Arrays;
import java.util.Random;

public class a122_Arrays_Challenge {
    /** moja wersja */
//    public static void main(String[] args) {
//
//        int[] randomArray = getRandomArray(10);
//        System.out.println(Arrays.toString(randomArray));
//
//        Arrays.sort(randomArray);
//        int[] sortedArray = randomArray;
//        System.out.println(Arrays.toString(sortedArray));
//
//        /** https://stackoverflow.com/a/58285958 */
//        Integer[] descArray = new Integer[sortedArray.length];
//        for (int i = 0; i < sortedArray.length; i++)
//            descArray[i] = sortedArray[i];
//        Arrays.sort(descArray, Collections.reverseOrder());
//        /** */
//        System.out.println(Arrays.toString(descArray));
//    }
//    private static int[] getRandomArray(int length) {
//        Random random = new Random();
//        int[] newInt = new int[length];
//        for (int i = 0; i < length; i++) {
//            newInt[i] = random.nextInt(100);
//        }
//        return newInt;
//    }


    /** kurs */
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));

        int[]sortedArray = sortIntegers(new int[]{7,30,35});
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newInt = new int[length];
        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temporary;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;
                    flag = true;
                    System.out.println("------>"+Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->"+Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
