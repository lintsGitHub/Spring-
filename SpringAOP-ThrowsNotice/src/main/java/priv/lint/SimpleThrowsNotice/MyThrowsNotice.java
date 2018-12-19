package priv.lint.SimpleThrowsNotice;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsNotice implements ThrowsAdvice {

    /*
    * <pre class="code">public void afterThrowing(Exception ex)</pre>
    * <pre class="code">public void afterThrowing(RemoteException)</pre>
    * <pre class="code">public void afterThrowing(Method method, Object[] args, Object target, Exception ex)</pre>
    * <pre class="code">public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)</pre>
    * 这里有四个实现，看源码得出
    * 为什么他不写出来呢？
    * 因为这都是重载的方法，如果都写出来那我在实现这个接口时，就要实现这四个方法
    * 这样做显然是不好的，他就给注释指示我们可以使用这四个方法 ，我们想使用哪个就使用哪个岂不美哉
    * */
//    当目标方法抛出与指定类型的异常具有is-a关系时，这个方法执行
    public void afterThrowing(Exception ex){
        System.out.println("异常通知");
    }
    //    当目标方法抛出MyException的异常具有is-a关系时，这个方法执行
    public void afterThrowing(MyException ex){
        System.out.println("异常通知" + ex.getMessage());
    }

}
