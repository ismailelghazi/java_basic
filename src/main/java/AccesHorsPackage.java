import ma.education.tp1.introduction.*;

import static java.lang.System.*;

public class AccesHorsPackage extends Salle {
    public AccesHorsPackage(){}
    void afficher()
    {
        out.println(super.id+" "+super.nom);
    }

    public static void main(String[] args) {

        AccesHorsPackage B = new AccesHorsPackage();
        B.id = 45;
        B.nom = "ismail";
        B.nbr = 20;
        out.println(B);
        affiche(10,"ismail");
    }

}
