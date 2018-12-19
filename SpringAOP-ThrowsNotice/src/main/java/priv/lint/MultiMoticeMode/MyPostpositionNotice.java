package priv.lint.MultiMoticeMode;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyPostpositionNotice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("=========");
        System.out.println(method.getName());
        System.out.println(returnValue);
        System.out.println("后置通知");
    }
}
