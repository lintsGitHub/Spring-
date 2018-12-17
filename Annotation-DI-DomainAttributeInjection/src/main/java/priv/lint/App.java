package priv.lint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import priv.lint.beans.Computer;
import priv.lint.beans.Student;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        * 对于注解方式的域属性注入有两种方式
        * 1，使用Spring中的两个注解
        * @Autowired 注解 ByType (根据类型)方式注入
        * @Qualifier 注解 ByType （根据名字）方式注入 注意要与@Autowired 注解一起使用
        * 2，使用JSR205规范
        * @Resource("name") 注解 如果不加参数就是ByType类型注入 ， 如果加name就是根据ByName注入
        * */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class, Computer.class);
        Student bean = context.getBean(Student.class);
        System.out.println(bean);


    }
}
