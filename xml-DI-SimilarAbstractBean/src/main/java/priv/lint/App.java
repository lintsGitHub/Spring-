package priv.lint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu1 = (Student) context.getBean("stu1");
        Student stu2 = (Student) context.getBean("stu2");
        Student stu3 = (Student) context.getBean("stu3");
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
    }
}
