package priv.lint.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//其实在Spring中还有三个注解与@Component功能上是相同的（底层代码一样），但意义不同，也就是说我们可以根据特定的地方使用特定的注解，可以达到使用这个注解的语义
//1, @Repository :注解在DAO实现类上
//2, @Service : 注解在Service实现类上
//3, @Controller : 注解在SpringMVC的处理器上
//4, @Component ： 注解在普通（POJO）类上
//Spring这些（前三）注解留着以后可能进行扩展使用
@Component("student") //组件，表示这个类为Spring所管理，也就是说这个类会被Spring实例为Bean放到容器中
public class Student {
    @Value("李雷")
    String name;
    @Value("21")
    int age;

    @Autowired //ByType方式的注解式注入 ，会在容器或者说在配置的包里面找 is-a 关系
    @Qualifier("MyComputer") //ByName方式注解注入，会在容器或者说在配置的包里面找name为MyComputer这个类注入到里面去
    /*
    * 注意ByName方式要与ByType联合使用，也就是说@Qualifier这个注解要联合@Autowired一起使用
    * */
    Computer computer;  //对象属性，域属性

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computer=" + computer +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
