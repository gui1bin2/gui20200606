package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class applicationSpring {

    public static void main(String[] args) {

        System.out.println("applicationSpring");

        ApplicationContext context = new AnnotationConfigApplicationContext(applicationSpring.class);


    }
}
