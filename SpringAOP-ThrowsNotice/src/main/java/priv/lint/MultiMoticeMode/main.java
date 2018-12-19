package priv.lint.MultiMoticeMode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MultiMoticeContext.xml");
        Per per = (Per) context.getBean("per");
        System.out.println(per.sayHello());
    }
}
