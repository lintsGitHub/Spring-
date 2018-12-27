package priv.lint.AnnotativeDevelopment;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect // 表示当前类是一个切面类
public class MyAspectJ {

    /*
    * 前置通知，这个使用注解的方式进行实现
    * 使用Before这个注解进行实现，value放的就是切入点规则
    * 这里这个切入点方法中还可以传入一个参数(JoinPoint)，这个参数就记载着被切入方法的一些信息，比如，是哪个类的啊，什么方法啊，等等
    * 如果我们要进行处理也很方便，对其内部功能进行加强也是可以的
    * 在这个切入点上面我们也看到了AspectJ对同一个方法进行的多次前置通知的一个方案：
    * 我就留着，你给多少个通知我一个不落的加上去，但是要按照队列顺序来
    * 1,我们也可想一下为什么他会采取一种类似正则表达式的方式进行一个匹配规则
    * 这里的一些底层技术是什么
    * 我们可以看到如果不使用这种类似的正则表达式的方案，我们如果要进行对加强的类方法也就很难去灵活查找，
    * 如果只是给全限定类名加方法名加方法参数这种方案，如果是分配在多个包的情况下，会显得很薄弱
    * 底层的一些技术，反射，泛型。。。等等
    * 底层应该还有一个比较厉害的算法去匹配
    * */
    @Before(value = "execution(* * ..StudentService.sayHello(..))")
    public void before(){
        System.out.println("执行MyAspectJ中的前置方法");
    }

    @Before(value = "execution(* * ..StudentService.sayHello(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("JoinPoint - :" + joinPoint);
        System.out.println("joinPoint.getKind() - :" + joinPoint.getKind());
        System.out.println("joinPoint.getThis() - ："+ joinPoint.getThis());
        System.out.println("执行MyAspectJ中的前置方法");
    }

    /*
    * 后置通知
    * 这里提供了两个注解：@AfterReturning @After
    * 这两个注解有什么区别呢？
    * 这两个功能看似差不多，但是通过看源码我们可以知道，前者的功能比后者的功能强大
    * 其实底层源码是一样的，或许是AspectJ是觉得After的功能还没有满足大家的需求，然后就推一个强大一点的出来吧
    * 我们还可以在注解中加参数，
    * 在之前的一些后置通知时，我们都可以拿到它的结果，然后可以对结果进行处理，而现在我们也可以拿到结果
    * 写法：
    * @AfterReturning(value = "execution(* priv.lint.AnnotativeDevelopment.StudentService.sayHi())",returning = "res")
    * public void afterAspectJ(Object res){
    * 这里又是通过什么底层技术进行一个数据的迁移？
    * */
    @AfterReturning(value = "execution(* priv.lint.AnnotativeDevelopment.StudentService.sayHi())")
    public void afterAspectJ(){
        System.out.println("执行MyAspectJ中的后置通知方法--使用@AfterReturning注解");
    }

    @AfterReturning(value = "execution(* priv.lint.AnnotativeDevelopment.StudentService.sayHi())",returning = "res")
    public void afterAspectJ(Object res){
        System.out.println(res);
        System.out.println("执行MyAspectJ中的后置通知方法--使用@AfterReturning注解");
    }

    @After(value = "execution(* priv.lint.AnnotativeDevelopment.StudentService.sayHi())")
    public void aVoid(){
        System.out.println("执行MyAspectJ中的后置通知方法--使用@After注解");
    }

    /*
    * 环绕通知：
    * 使用注解：（@Around）
    * 在环绕通知中我们必须要包含一个参数（ProceedingJoinPoint），这个参数就可以去执行我们的目标方法
    * 如果我们的这个环绕通知切面方法是一个void类型我们没有办法将这个结果带回去，
    * 也就是说我们就将其设为有返回值类型的，最好使用Object
    * */
    @Around(value = "execution(* * ..StudentService.sayName(..))")
    public Object myAround( ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知之前");
        Object proceed = point.proceed();
        System.out.println("环绕通知之后");
        return proceed;
    }


    /*
    * 异常通知：
    * 使用注解：@AfterThrowing
    * 也可以指定异常类型
    * 就可以在方法参数中包含异常类型
    * @AfterThrowing(value = "execution(* * ..StudentService.myThrow(..)))",throwing = "e")
    *   public void myAfterThrowing(Exception e){
    * */
    @AfterThrowing(value = "execution(* * ..StudentService.myThrow(..)))",throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println(e.getMessage());
        System.out.println("异常通知");
    }

    /*
    * 定义切入点：
    * 我们在上面的代码中发现了一些问题，我们写配置规则那个东西如果是一样的我们就没有必要写多个了
    * 这就引入了切入点，就是可以理解为我定义一个变量去代替重复的规则
    * 用法如下：
    *
    * */
    @AfterThrowing(value = "myPointcut()")
    public void myAfterThrowing(){
        System.out.println("异常通知");
    }
    @Pointcut("execution(* * ..StudentService.myThrow(..)))")
    public void myPointcut(){}
}
