import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = 
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catbean =
                (Cat) applicationContext.getBean("cat");
        Cat catbean1 =
                (Cat) applicationContext.getBean("cat");

        System.out.println(bean.hashCode() == bean1.hashCode());
        System.out.println(catbean.hashCode() == catbean1.hashCode());


    }
}