package priv.lint;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.lint.Bean.SetValueInjectionImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SetValueInjectionImpl bean = context.getBean(SetValueInjectionImpl.class);
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
        System.out.println((bean.getStudent()).getName());
    }
}
