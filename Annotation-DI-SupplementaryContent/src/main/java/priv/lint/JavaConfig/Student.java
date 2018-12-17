package priv.lint.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Student implements Per{
    @Value("零")
    String name;

    Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public String sayHello() {
        return "hello";
    }
}
