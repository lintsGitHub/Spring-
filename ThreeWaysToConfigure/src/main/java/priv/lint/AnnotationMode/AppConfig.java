package priv.lint.AnnotationMode;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import priv.lint.AnnotationMode.an.Student;


@Configurable
public class AppConfig {
    @Bean
    public Student getStudent(){
        return new Student();
    }
}
