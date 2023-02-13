package s12_JavaGenerics;

import java.util.ArrayList;

public class a163_GenericsIntroduction {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }

//    private static void printDoubled(ArrayList<Integer> n) {
//        for (int i : n) System.out.println(i * 2);
//    }
}
