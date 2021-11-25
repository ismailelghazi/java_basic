package ma.education.tp3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ma.education.tp3.Client;
public class TestSpringIocApplicationContextcontenant {
    public static void main(String[] args) {
        ApplicationContext appContext=new AbstractApplicationContext() {
        };
        new ClassPathXmlApplicationContext("spring.xml");
        Client client = (Client ) appContext.getBean("clt");
    }

}
