package priv.lint.SurroundNotice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("surroundApplicationContext.xml");
        Per proxyBean = (Per) context.getBean("proxyBean");
        System.out.println(proxyBean.sayHello());
        System.out.println(proxyBean.sayHi());
    }
}
