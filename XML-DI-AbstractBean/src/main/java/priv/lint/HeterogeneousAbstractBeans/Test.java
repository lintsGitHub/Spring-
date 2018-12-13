package priv.lint.HeterogeneousAbstractBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Per alan = (Student) context.getBean("Agnes");
        System.out.println(alan);
        alan.behavior();
    }
}
