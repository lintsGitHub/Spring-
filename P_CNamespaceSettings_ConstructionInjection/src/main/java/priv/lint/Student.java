package priv.lint;

import java.util.List;

public class Student {
    String name;
    String stuClass;
    List hobby;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", hobby=" + hobby +
                '}';
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public Student(String stuClass) {
        this.stuClass = stuClass;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }
}
