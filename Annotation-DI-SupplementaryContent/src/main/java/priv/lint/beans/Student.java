package priv.lint.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {
    @Value("零")
    String name;
    @Autowired
    Computer computer;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", computer=" + computer +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

//    生命开始方法
    @PostConstruct
    public void init(){
        System.out.println("生命开始");
    }
    //    生命结束方法
    @PreDestroy
    public void destroy(){
        System.out.println("生命结束");
    }
}
