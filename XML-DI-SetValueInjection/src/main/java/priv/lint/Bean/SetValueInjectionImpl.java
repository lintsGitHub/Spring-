package priv.lint.Bean;

public class SetValueInjectionImpl implements SetValueInjection {

    String name;
    int age;
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SetValueInjectionImpl(String name, int age, Student student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public SetValueInjectionImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public SetValueInjectionImpl() {
    }

    public SetValueInjectionImpl(String name) {
        this.name = name;
    }

    @Override
    public String seyHello() {
        return "Hello";
    }
}
