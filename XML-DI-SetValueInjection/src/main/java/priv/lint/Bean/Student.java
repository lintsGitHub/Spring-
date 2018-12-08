package priv.lint.Bean;

public class Student {
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("执行Student的getName方法");
        return name;
    }

    public void setName(String name) {
        System.out.println("执行Student的setName方法");
        this.name = name;
    }
}
