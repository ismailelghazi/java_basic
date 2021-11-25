package ma.education.tp2.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;
public class TestReflection{

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");
        String  value=   rb.getString("keyClass1");
        Class<?> c = Class.forName(value);
        System.out.println(c.toString());
        Constructor[] constructors;
        constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toString());
        }
        constructors[0].setAccessible(true);
        Object o = constructors[0].newInstance(null);
        System.out.println(o.getClass());
    }
//    public static void main(String[] args) {
//        Salle.affiche(10,"text");
//        Class SLc = Salle.class;
//        Field [] f = SLc.getDeclaredFields();
//        for (int i =0;i<f.length;i++)
//        {
//            System.out.println(f[i].getName());
//
//        }
//        Method [] m = SLc.getDeclaredMethods();
//        for (int i =0;i<m.length;i++)
//        {
//            System.out.println(m[i].getName());
//
//        }
//        Constructor C[] =SLc.getDeclaredConstructors();
//        for (int i =0;i<C.length;i++)
//        {
//            System.out.println(C[i].getName());
//
//        }
//    }


}
