package ma.cigma1.pfe.contollers;
import ma.cigma1.pfe.models.client;
import ma.cigma1.pfe.serv.clientService;
import ma.cigma1.pfe.serv.clientServiceImpl;

public class ClientController {
    clientService clientService = new clientServiceImpl();

    public ClientController() {
        System.out.println("creation d'un object Client controller...");
    }

    public client save(client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

}
