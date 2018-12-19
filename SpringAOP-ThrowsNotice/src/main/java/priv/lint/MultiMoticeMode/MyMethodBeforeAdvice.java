package priv.lint.MultiMoticeMode;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("=========");
        System.out.println(method.getName());
        System.out.println("前置通知");
    }
}
