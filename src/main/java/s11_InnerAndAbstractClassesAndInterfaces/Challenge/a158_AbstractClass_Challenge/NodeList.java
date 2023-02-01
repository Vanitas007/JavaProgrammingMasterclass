package s11_InnerAndAbstractClassesAndInterfaces.Challenge.a158_AbstractClass_Challenge;

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}
