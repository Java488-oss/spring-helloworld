import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW =  (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecondHW =  (HelloWorld) applicationContext.getBean("helloworld");
    }
}