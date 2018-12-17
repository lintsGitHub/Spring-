package priv.lint.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //将这个类作为Spring中的一个容器来进行创建一些Bean对象
public class MyJavaConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}
