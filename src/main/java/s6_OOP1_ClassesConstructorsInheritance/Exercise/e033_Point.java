package s6_OOP1_ClassesConstructorsInheritance.Exercise;

public class e033_Point {

    private int x;
    private int y;

    public e033_Point() {
    }

    public e033_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        System.out.println("Pierwszy distance - pusty");
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        System.out.println("Drugi distance");
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    public double distance(e033_Point xy) {
        System.out.println("Trzeci Distance");
        return Math.sqrt((getX() - xy.getX()) * (getX() - xy.getX()) + (getY() - xy.getY()) * (getY() - xy.getY()));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
