package priv.lint.JavaConfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //将这个类作为Spring中的一个容器来进行创建一些Bean对象
public class MyJavaConfig {

    @Bean
    public Teacher teacher(){
        return new Teacher();
    }

    /*
    * autowire = Autowire.BY_TYPE 根据类型自动注入
    * autowire = Autowire.BY_NAME 根据名称自动注入
    * */
    @Bean(name = "lint", autowire = Autowire.BY_TYPE)
    public Student student(){
        return new Student();
    }
}
