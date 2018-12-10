package priv.lint;

public class School {
    String name;
    Student student;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
