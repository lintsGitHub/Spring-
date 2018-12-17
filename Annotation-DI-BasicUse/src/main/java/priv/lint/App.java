package priv.lint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
//        注意：使用Spring注解可能有些地方使用到SpringAOP
//        第一种方式使用XML，在XML中定义一个注解扫描器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student bean = context.getBean(Student.class);
        System.out.println(bean);

//      单纯使用注解扫描注解类AnnotationConfigApplicationContext，然后就可以从容器中拿出来使用了

        /*
        * org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'priv.lint.beans.Computer' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
        * 在使用域属性ByType注入也就是使用@Autowired 注解式配置， 根据类型找不到这个类注入到Student中的Computer属性中
        * 这里它提出了一个解决方案是@Autowired(required=true) 这个方案是什么意思呢？
        * 就是说当早不到类型匹配的参数赋值到这个属性时，可以选择跳过，而不是抛出异常
         * */
        AnnotationConfigApplicationContext ancontext = new AnnotationConfigApplicationContext(Student.class, Computer.class);
        Student bean1 = ancontext.getBean(Student.class);
        System.out.println(bean1);
    }
}
