package s10_ListArrayListLinkedListIteratorAutoboxing.Challenge;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class a140_LinkedList_Challenge {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);

        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Darwin", 3971));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Perth", 3923));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Originating: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
            switch (menuItem) {
                case "F" -> {
                    System.out.println("User wants to go forward");
                    if (!forward) {             //Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();    //Adjust position forward
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("User wants to go backwards");
                    if (forward) {             //Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();    //Adjust position backwards
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "M" -> printMenu();
                case "L" -> System.out.println(placesToVisit);
                default -> quitLoop = true;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);

    }

    private static void printMenu() {
        String textBlock = """
                Available actions (select word or letter):

                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
    }
}
