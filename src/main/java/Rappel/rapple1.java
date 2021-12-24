package Rappel;
public class rapple1 {
    static int vitesse = 10;
    rapple1(int v){
        this();
        vitesse+=v;
    }
    rapple1(){
        vitesse++;
    }
    public static void main(String[] args) {
        rapple1 r1=new rapple1(11);
        //r1 =  11+10+1 --> r1=22
        rapple1 r2=new rapple1(10);
        //r2 =10+1+r1 --> r2=33
        System.out.println(r1.vitesse);
        System.out.println(r2.vitesse);
    }
}
