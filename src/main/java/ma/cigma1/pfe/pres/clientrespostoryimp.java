package ma.cigma1.pfe.pres;
import ma.cigma1.pfe.models.client;

public class clientrespostoryimp implements ClientRepository {
    @Override
    public client save(client c) {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        return null;
    }
}

