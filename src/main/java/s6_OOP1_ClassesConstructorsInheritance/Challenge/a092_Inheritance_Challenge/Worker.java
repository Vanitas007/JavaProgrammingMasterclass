package s6_OOP1_ClassesConstructorsInheritance.Challenge.a092_Inheritance_Challenge;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    /**
     * Constructors
     */
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker() {
    }

    /**
     * Methods
     */
    public int getAge() {
        int currentYear = 2022;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
