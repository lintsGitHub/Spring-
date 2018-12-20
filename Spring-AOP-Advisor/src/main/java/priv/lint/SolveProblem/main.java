package priv.lint.SolveProblem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SolveProblemContext.xml");
        Per per = (Per) context.getBean("per");
        System.out.println(per.sayHello());
        System.out.println(per.sayHi());
    }
}
