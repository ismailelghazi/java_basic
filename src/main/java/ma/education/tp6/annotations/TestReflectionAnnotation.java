package ma.education.tp6.annotations;
import ma.education.tp6.annotations.programmer;
import static ma.education.tp6.annotations.programmer.date;

public class TestReflectionAnnotation {

    public static void main(String[] args) {
        Class c = Calculatrice.class;
        programmer programmer = (programmer)
                c.getDeclaredAnnotation(programmer.class);
        System.out.println("ID : "+programmer.id()+"\nName : "+programmer.name()+"\nDate : "+programmer.dtf.format(date));
    }
/*
    public static void main(String[] args) {
        Class c = CalculatriceMath.class;
        programmer Programmer = (programmer)
                c.getAnnotation(programmer.class);
        System.out.println(Programmer.id()+":"+Programmer.name());
    }*/
}
