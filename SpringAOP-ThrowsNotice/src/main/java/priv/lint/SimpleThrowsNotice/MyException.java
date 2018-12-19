package priv.lint.SimpleThrowsNotice;

/*
* 异常可以分两种：
* 1，运行时异常 继承RunTimeException  不处理也可以通过编译
* 2，编译时异常（受查异常） CheckedException 不处理不可以通过编译
* 继承Exception ，这个类就是受查异常
* */
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
