package ma.education.tp5.annotations;

public class Client implements Comparable {
//    Integer code;
//    String name;
//    public Client(Integer code, String name) {
//        this.code = code;
//        this.name = name;
//    }
//    @Override
//    public String toString() {
//        return "Client{" +
//                "code=" + code +
//                ", name='" + name + '\'' +
//                '}';
//    }
//    @Override
//    public int compareTo(Object o) {
//        Client client = (Client) o;
//        return -client.code+this.code;
//    }
Integer code;
    String name;
    public Client(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
