package priv.lint.PrepositionNotice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("prepositionApplicationContext.xml");
       /*如果是这样去拿那个Student对象时会报错
       * NoUniqueBeanDefinitionException: No qualifying bean of type 'priv.lint.PrepositionNotice.Student' available: expected single matching bean but found 2: student,proxyFactoryBean
       * 有两个Student类型的Bean，因为我们使用代理时是会在获得不是原来的那个对象，是增强后的对象
       * */
        //        Student student = context.getBean(Student.class);
        Per student = (Per) context.getBean("proxyFactoryBean");
        student.sayHello();
    }
}
