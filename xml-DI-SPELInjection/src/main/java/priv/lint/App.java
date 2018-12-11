package priv.lint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Per bean = context.getBean(Per.class);
        System.out.println(bean);
        Student stu = context.getBean(Student.class);
        System.out.println(stu);
        
    }
}
