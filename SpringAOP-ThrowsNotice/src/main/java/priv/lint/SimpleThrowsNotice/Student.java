package priv.lint.SimpleThrowsNotice;

public class Student implements Per {
    @Override
    public String sayHello() {
        System.out.println("hello" + 1 / 0);
        return "HELLO";
    }

    @Override
    public void addUser(String name, String psw) throws MyException {
        if (!"nf".equals(name))
            throw new MyException("MyException");
        else if (!"123".equals(psw))
            throw new MyRunTimeException("MyRunTimeException");
    }
}
