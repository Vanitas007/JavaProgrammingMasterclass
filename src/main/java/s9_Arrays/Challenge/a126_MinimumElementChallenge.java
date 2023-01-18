package s9_Arrays.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class a126_MinimumElementChallenge {
    public static void main(String[] args) {

        int[] returnedArray = readIntegersKURS();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

        int[] descArray = reverseArray(returnedArray);
        System.out.println(Arrays.toString(descArray));

        reverseArrayKURS(returnedArray);
        System.out.println("Final" + Arrays.toString(returnedArray));
    }

    /**
     * Chciałem pobierać input jako Stringa.
     * Następnie stworzyć tablicę z wyniku podziału Stringa splitem.
     * I na koniec print zawartości tablicy.
     * potem miało byc rzutowanie Stringów na int
     */
//    public static void readIntegers() {
//        Scanner scanner = new Scanner(System.in);
//        scanner.hasNext();
//        String userInput = scanner.toString();
//        String[] splitedInput = userInput.split(",");
//        System.out.println(Arrays.toString(splitedInput));
//    }
    private static int[] readIntegersKURS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    /**
     * moje, tylko czy sortowanie to poprawna praktyka?
     */
//        private static int findMin(int[] array) {
//        Arrays.sort(array);
//        return array[0];
//    }
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    /**
     * moja wersja
     */
    private static int[] reverseArray(int[] array) {
        Arrays.sort(array);
//        int[] descArray = Arrays.copyOf(array, array.length);
        int[] descArray = array.clone();

        for (int i = 0; i < array.length; i++) {
            array[i] = descArray[array.length - 1 - i];
        }
        return array;
    }
    private static void reverseArrayKURS(int[] array) {
        int maxIndex = array.length - 1;
        int halfLenght = array.length / 2;

        for (int i = 0; i < halfLenght; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}

//5,6,4,7,3,8,2,9,1