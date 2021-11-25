package ma.education.tp2.reflection.rappel;

public class ConnectionDB {
    String URL ;
    String user;
    String password;
    private ConnectionDB(){};
    public ConnectionDB(String URL, String user, String password) {
        this.URL = URL;
        this.user = user;
        this.password = password;
    }
    public class tst{

        public tst() {
        }
    }
}
