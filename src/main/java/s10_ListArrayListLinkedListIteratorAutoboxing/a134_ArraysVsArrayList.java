package s10_ListArrayListLinkedListIteratorAutoboxing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class a134_ArraysVsArrayList {
    public static void main(String[] args) {

        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Thuesday");
        System.out.println(newList);
    }
}
