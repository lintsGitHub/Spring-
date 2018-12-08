package priv.lint.Bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class  SetValueInjectionImpl implements SetValueInjection {

    String name;
    int age;
    Student student;
    List list ;

    @Override
    public String toString() {
        return "SetValueInjectionImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    Set set;
    Map map;
    private Properties properties;

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

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
