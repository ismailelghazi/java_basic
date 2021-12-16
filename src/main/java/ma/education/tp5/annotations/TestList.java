package ma.education.tp5.annotations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestList {
    public static void main(String[] args) {
       /* List<Integer> list1= new ArrayList<Integer>();
        for(int i = 0;i<24;i++){
         if (i ==12 || i==23) {
             for (int m= 0 ; m<2;m++)
             {list1.add(i);}}}
        for(Integer e :list1){
            Systmem.out.println(" element "+e);
        }*/
       /* List<Integer> list2= Arrays.asList(1,5,6,9,16);
        list2.stream().map(i->i+1).forEach(i->System.out.println(i));*/
        List<Integer> list3= new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(4,10);
        list3.forEach(i-> System.out.println(i));
    }
    }


