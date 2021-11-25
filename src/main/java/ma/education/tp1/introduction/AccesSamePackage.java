package ma.education.tp1.introduction;

public class AccesSamePackage {

    public static void main(String[] args) {
        Salle A = new Salle(10,"test");
        System.out.println(A.id+" "+A.nom);
    }
}
