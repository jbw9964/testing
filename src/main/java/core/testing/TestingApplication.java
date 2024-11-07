package core.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class TestingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(TestingApplication.class, args);

        System.out.println("JPA interface : ");
        AAA jpaRepo = context.getBean(AAA.class);
        showProperties(jpaRepo);

        System.out.println("\nImpl : ");
        AAAImpl impl = context.getBean(AAAImpl.class);
        showProperties(impl);
    }

    private static void showProperties(Object o)    {
        System.out.println("As string\t\t\t\t\t: " + o.toString());
        System.out.println("Class\t\t\t\t\t\t\t: " + o.getClass());
        System.out.println("Name\t\t\t\t\t\t\t: " + o.getClass().getSimpleName());
        System.out.printf("IdentityHashcode\t: 0x%08x\n", System.identityHashCode(o));
    }
}
