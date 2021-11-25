package ma.education.tp2.statickeyword;

public class TestStatic {
    public TestStatic(long id, String nom,int nbEtudiants) {
        this.id = id;
        this.nom = nom;
        nbEtudiants++;
    }

    public long id;
    public String nom;
    public static int nbEtudiants;

    public static void main(String[] args) {
    }
}
