package priv.lint.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

class main{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
////        通过反射进行赋值第一种方式
//        User user = new User();
//
////        * DeclaredFieId 翻译过来就是声明字段（也就是属性）
//        Field name = user.getClass().getDeclaredField("name");
////        设置私有属性可以进行访问
//        name.setAccessible(true);
//        name.set(user,"hello");
//        System.out.println(user);
////        第二种方式
//        Field name1 = User.class.getDeclaredField("name");
//        name1.setAccessible(true);
//        name1.set(user,"同是HELLO");
//        System.out.println(user);
//        User user = new User();
    }
}