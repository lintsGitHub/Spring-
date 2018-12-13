package priv.lint.MixedMode;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ImportResource;


@Configurable
//第二种使用ComponentScan注解进行扫描，而在priv.lint.MixedMode中的类要加上@Component注解
//@ComponentScan(basePackages = "priv.lint.MixedMode")
//第三种使用@ImportResource注解配置文件的注入
@ImportResource(locations = "applicationContextMixed.xml")
public class AppConfig {
//    1, 使用@Bean的方式
/*    @Bean
    public Student getStudent(){
        return new Student();
    }*/
}
