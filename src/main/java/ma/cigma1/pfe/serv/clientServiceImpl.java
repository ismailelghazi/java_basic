package ma.cigma1.pfe.serv;

import ma.cigma1.pfe.models.client;
import ma.cigma1.pfe.pres.ClientRepository;
import ma.cigma1.pfe.pres.clientrespostoryimp;

public class clientServiceImpl implements clientService {
    ClientRepository clientRepository = new clientrespostoryimp();
    @Override
    public client save(client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

}
