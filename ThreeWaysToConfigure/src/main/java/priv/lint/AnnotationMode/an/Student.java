package priv.lint.AnnotationMode.an;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class Student implements per {

    String name;

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
