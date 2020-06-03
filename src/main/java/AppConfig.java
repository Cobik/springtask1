import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope(value="prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setName("Vasya");
        cat.setAge("1");
        cat.setColor("grey");
        return cat;
    }
}