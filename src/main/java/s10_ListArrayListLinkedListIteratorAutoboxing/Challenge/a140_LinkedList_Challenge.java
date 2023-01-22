package s10_ListArrayListLinkedListIteratorAutoboxing.Challenge;


import java.util.LinkedList;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class a140_LinkedList_Challenge {

//    private static final Scanner scanner = new Scanner(System.in);

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
//
//        placesToVisit.sort(Comparator.comparingInt(Place::distance));

//        boolean flag = true;
//        while (flag) {
//            printActions();
//            switch (scanner.nextLine()) {
//                case "F", "Forward" -> forward(placesToVisit);
//                case "B", "Backward" -> System.out.println("b");
//                case "L", "List Places" -> System.out.println("L");
//                case "M", "Menu" -> System.out.println("M");
//                default -> flag = false;
//            }
//        }
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

//        list.add(new Place("Sydney", 0));
//        list.add(new Place("Adelaide", 1374));
//        list.add(new Place("Alice Springs", 2771));
//        list.add(new Place("Brisbane", 917));
//        list.add(new Place("Darwin", 3971));
//        list.add(new Place("Melbourne", 877));
//        list.add(new Place("Perth", 3923));
    }

//    private static void forward(LinkedList<Place> list) {
//        System.out.println("Trip starts at " + list.getFirst());
//        for (int i = 1; i < list.size(); i++) {
//
////            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
//        }
//        System.out.println("Trip ends at " + list.getLast());
//    }
//
//
//    private static void printActions() {
//        String textBlock = """
//                Available actions (select word or letter):
//
//                (F)orward
//                (B)ackward
//                (L)ist Places
//                (M)enu
//                (Q)uit""";
//        System.out.println(textBlock);
//    }
}
