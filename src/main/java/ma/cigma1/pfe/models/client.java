package ma.cigma1.pfe.models;

import lombok.Data;


public class client {
    public client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private long id ;
    private String name;

    public client(){

    }

}
