package ma.education.tp1.introduction;
import java.lang.reflect.InvocationTargetException;
public class Salle {
        public long id;
     public String nom;
     public  int nbr;
     protected String mat;

    //Un constructeur sans paramètres
       public Salle(){}
    //Un constructeur pour le nom de la salle
    public Salle(String nom){
        this.nom = nom;
    }
    //Un constructeur pour le nom et id de la salle
    public Salle(long id, String nom) {
        this(nom);
        this.id = id;
    }
   public static    void affiche(long id,String nom)
    {
        System.out.println(id+" "+nom);
    }
    public String toString(){
           return "l'id : "+id+" le nom : "+nom+" nbr de class : "+nbr;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
    }

}
