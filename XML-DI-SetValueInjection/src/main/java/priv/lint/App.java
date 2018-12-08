package priv.lint;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.lint.Bean.SetValueInjectionImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
         * Bean实例参数的注入分两种：设值注入，构造注入
         * 我们使用Student就用设值注入
         *SetValueInjectionImpl 就使用 构造注入
         *
         * */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        如果是合并操作时，使用类实例来获取Bean会出错 NoUniqueBeanDefinitionException 意思就是这个Bean在配置时并不是唯一的
//        SetValueInjectionImpl bean = context.getBean(SetValueInjectionImpl.class);
//        获取子的Bean
        SetValueInjectionImpl bean = (SetValueInjectionImpl) context.getBean("child");

        System.out.println(bean);
//        显示学生姓名
        System.out.println((bean.getStudent()).getName());
////        显示list数据
//        System.out.println(bean.getList().toArray().toString());
////        显示set数据
//        System.out.println(bean.getSet().toArray().toString());
////        显示map数据
//        System.out.println(bean.getMap().size());
////        显示properties数据
//        System.out.println(bean.getProperties().getProperty("one"));
    }
}
