package priv.lint.DefaultAdvisorAutoProxyCreator;

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
