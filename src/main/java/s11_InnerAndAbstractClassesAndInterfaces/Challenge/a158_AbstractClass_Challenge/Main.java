package s11_InnerAndAbstractClassesAndInterfaces.Challenge.a158_AbstractClass_Challenge;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
