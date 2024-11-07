package core.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class TestingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(TestingApplication.class, args);

        printBeanName(context, AAA.class);

        try {
            System.out.println(context.getBean("JPATestRepoImpl"));
        }
        catch (Exception e) {
            System.out.println("no such bean");
        }

        try {
            System.out.println(context.getBean("jPATestRepoImpl"));
        }
        catch (Exception e) {
            System.out.println("no such bean");
        }
    }

    private static void printBeanName(ConfigurableApplicationContext context, Class<?> clazz) {
        for (String name : context.getBeanNamesForType(clazz)) {
            System.out.println(name);
        }
        System.out.println();
    }
}
