package priv.lint.SurroundNotice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/*
* 这个MethodInterceptor 接口
* spring中有一个，aop联盟有一个
* 我们使用的是aop联盟中的那一个
* 如果使用spring中的那个会报错
* UnknownAdviceTypeException: Advice object [priv.lint.SurroundNotice.aa@6737fd8f] is neither a supported subinterface of [org.aopalliance.aop.Advice] nor an [org.springframework.aop.Advisor]
* 它让我们去使用AOP联盟中那个
 * */
public class MySurroudNotice implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知：目标方法执行之前");
//        System.out.println(methodInvocation.getMethod().getName());
        /*
        * 在这里我们对返回的结果做了一些小手段，把它变成小写了并返回
        * 其实我们可以做更多的处理
        * 这里会执行一次方法，得到返回值，然后返回
        * */
        Object proceed = methodInvocation.proceed().toString().toLowerCase();
        System.out.println("我在修改");
//        System.out.println(proceed.toString().toLowerCase());
        System.out.println("环绕通知：目标方法执行之后");
        return proceed;
    }
}
