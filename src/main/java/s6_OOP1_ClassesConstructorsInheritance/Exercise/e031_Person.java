package s6_OOP1_ClassesConstructorsInheritance.Exercise;

public class e031_Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        else if (firstName.isEmpty()) return lastName;
        else if (lastName.isEmpty()) return firstName;
        else return firstName + " " + lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }
}
