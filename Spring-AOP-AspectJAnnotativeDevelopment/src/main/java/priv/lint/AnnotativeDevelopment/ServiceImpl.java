package priv.lint.AnnotativeDevelopment;

public class ServiceImpl implements StudentService {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public void sayHi() {
        System.out.println("hi");
    }

    @Override
    public void sayName() {
        System.out.println("李大千");
    }

    @Override
    public void myThrow() {
        System.out.println("我的一个异常" + 1/0);
    }
}
