package priv.lint.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Student {
    @Value("李四")
    String name;
//    @Autowired
//    @Resource  //ByType 类型注入 使用JSR-250注解
    @Resource(name = "MyComputer")  //ByName 名字注入 使用JSR-250注解
    Computer computer;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", computer=" + computer +
                '}';
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
