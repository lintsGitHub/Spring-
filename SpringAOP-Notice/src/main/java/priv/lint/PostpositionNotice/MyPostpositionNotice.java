package priv.lint.PostpositionNotice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//后置通知
public class MyPostpositionNotice implements AfterReturningAdvice {

//    在目标方法执行之后执行
    /*
    * returnValue 目标方法的返回值
    * 后置通知可以获取目标方法的返回结果，但无法改变它的结果
    * */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(returnValue.getClass().getName());
        System.out.println(o1.getClass().getName());
        System.out.println(method.getName());
        System.out.println("后置通知");
    }
}
