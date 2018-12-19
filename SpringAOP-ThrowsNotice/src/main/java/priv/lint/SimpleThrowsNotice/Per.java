package priv.lint.SimpleThrowsNotice;

public interface Per {
    String sayHello();
    void addUser(String name , String psw) throws MyException;
}
