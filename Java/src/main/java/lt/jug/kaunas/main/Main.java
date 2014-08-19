package lt.jug.kaunas.main;

import lt.jug.kaunas.config.Context;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Context.class);
        applicationContext.getBean(Main.class).run();
    }

    public void run() {
        System.out.println("Application is running");
    }
}