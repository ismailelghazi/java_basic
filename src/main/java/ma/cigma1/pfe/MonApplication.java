package ma.cigma1.pfe;

import ma.cigma1.pfe.contollers.ClientController;
import ma.cigma1.pfe.models.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
       /* ClientController ctrl1 = new ClientController ();
        client client1 =new client(1,"test");
        ctrl1.save(client1);*/
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
    }
}