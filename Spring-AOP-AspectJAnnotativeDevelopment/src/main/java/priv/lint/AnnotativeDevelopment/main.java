package priv.lint.AnnotativeDevelopment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    StudentService service;
    @BeforeEach
    public void classBefore(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service= context.getBean(StudentService.class);
    }


    @Test
    public void beforeTest(){
//        前置通知
        service.sayHello();
        /*
        * 输出结果：
        * 执行MyAspectJ中的前置方法
            JoinPoint - :execution(void priv.lint.AnnotativeDevelopment.StudentService.sayHello())
            joinPoint.getKind() - :method-execution
            joinPoint.getThis() - ：priv.lint.AnnotativeDevelopment.ServiceImpl@614ca7df
            执行MyAspectJ中的前置方法
            hello
        * */
    }
    @Test
    public void afterTest(){
//        后置通知
        service.sayHi();
    }

    @Test
    public void myAround(){
//        环绕通知
        service.sayName();
    }

    @Test
    public void myThrow(){
//        异常通知
        service.myThrow();
    }

}
