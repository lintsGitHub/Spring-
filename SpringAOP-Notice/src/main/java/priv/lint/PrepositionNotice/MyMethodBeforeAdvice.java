package priv.lint.PrepositionNotice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
//前置通知
//@Component(value = "MyAdvice") // 将通知对象放到容器中
public class MyMethodBeforeAdvice implements MethodBeforeAdvice  {
//    当前目标方法执行前执行
    /*
    * Method ： 目标方法
    * args ： 目标方法的参数列表
    * target ： 目标对象
    * */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method);
        System.out.println(method.getName());
        System.out.println(target);
        System.out.println(target.getClass().getName());
        System.out.println("执行前置通知方法");
    }
}
