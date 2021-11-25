package ma.educationtp4.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Terre t1= Terre.getInstance(500, 10);
        Terre t2= Terre.getInstance(400, 102);
        System.out.println(t1.distanceToSoleil+" "+t1.surface);
        System.out.println(t2.distanceToSoleil+" "+t2.surface);

    }
}
