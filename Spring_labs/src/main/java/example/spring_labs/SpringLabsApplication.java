package example.spring_labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;


@SpringBootApplication
@Order(2)
public class SpringLabsApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringLabsApplication.class, args);
    }
}
