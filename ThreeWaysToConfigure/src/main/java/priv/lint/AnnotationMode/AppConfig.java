package priv.lint.AnnotationMode;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import priv.lint.AnnotationMode.an.Student;
import priv.lint.AnnotationMode.an.per;

@Configurable
@ComponentScan(basePackages = "priv.lint.AnnotationMode.an")
public class AppConfig {
    @Bean
    public Student getStudent(){
        return new Student();
    }
}
