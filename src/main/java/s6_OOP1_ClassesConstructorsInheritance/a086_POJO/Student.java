package s6_OOP1_ClassesConstructorsInheritance.a086_POJO;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String lassList;

    public Student(String id, String name, String dateOfBirth, String lassList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.lassList = lassList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", lassList='" + lassList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getLassList() {
        return lassList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLassList(String lassList) {
        this.lassList = lassList;
    }
}
