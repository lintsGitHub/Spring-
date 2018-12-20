package priv.lint.BeanNameAutoProxyCreator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanNaneAutoProxyContext.xml");
        Per student = (Per) context.getBean("student");
        System.out.println(student.sayHello());
        System.out.println(student.sayHi());
        Per teacher = (Per) context.getBean("teacher");
        System.out.println(teacher.sayHello());
        System.out.println(teacher.sayHi());
    }
}
