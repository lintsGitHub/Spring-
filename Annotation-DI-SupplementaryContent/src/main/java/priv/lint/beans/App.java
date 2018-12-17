package priv.lint.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import priv.lint.beans.Computer;
import priv.lint.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class, Computer.class);
        Student bean = context.getBean(Student.class);
        System.out.println(bean);
        context.close();
    }
}
