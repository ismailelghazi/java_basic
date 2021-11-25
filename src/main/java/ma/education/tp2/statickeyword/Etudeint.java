package ma.education.tp2.statickeyword;

public class Etudeint {
    public Etudeint(long id, String nom,int nb) {
        this.id = id;
        this.nom = nom;
        nbEtudiants+=nb;
    }

    public long id;
    public String nom;
    public static int nbEtudiants;

    public static void main(String[] args) {
        Etudeint e1= new Etudeint(1, "AHMED", 20);
        Etudeint e2= new Etudeint(2, "SAID", 30);
        System.out.println(e1.id+" "+e1.nom+" "+e1.nbEtudiants);
        System.out.println(e2.id+" "+e2.nom+" "+e2.nbEtudiants);

    }
}
