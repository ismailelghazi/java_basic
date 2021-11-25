package ma.education.tp1.introduction;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
        SalleCours s6= new SalleCours(2, "Salle 2", 20);
       // SalleCours s7=  s5;
        SalleCours s8=s6;
        //System.out.println(s7.id);
        Salle s1 = new SalleCours(1, "Salle 1", 20);
        SalleCours s2 = new SalleCours(2, "Salle 2", 20);
        SalleCours s3= (SalleCours) s1;
        SalleCours s4=s2;
        System.out.println(s1.id+" "+s1.nom+" "+ ((SalleCours) s1).nbPlaces);
        System.out.println(s2.id+" "+s2.nom+" "+s2.nbPlaces);
        System.out.println(s3.id);

    }
}
