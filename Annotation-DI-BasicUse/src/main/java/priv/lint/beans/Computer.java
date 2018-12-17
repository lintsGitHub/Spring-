package priv.lint.beans;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

//@Scope("prototype") //配置这个类的作用域,默认是singleton
@Component("MyComputer")
public class Computer {
    @Value("戴尔")
    String name;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
