package priv.lint.BeanNameAutoProxyCreator;

public class Teacher implements Per {
    @Override
    public String sayHello() {
        return "teacherHello";
    }

    @Override
    public String sayHi() {
        return "teacherHi";
    }
}
