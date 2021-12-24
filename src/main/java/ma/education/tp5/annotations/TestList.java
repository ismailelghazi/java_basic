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
        List<String> list3= new ArrayList<String>();
        list3.add("ABC1");
        list3.add(0,"EF2");
        list3.add(1,"ABC3");
        list3.add(0,"ABC4");
        System.out.println(list3);
//        list3.forEach(i-> System.out.println(i));
        Integer x = 0;//x=1-2-3-4-5-6-7-8
        Integer y = 0;//y=1-2
        for (Short z = 0 ;z < 5 ; z++)//z=1-2-3-4-5
        {
            if ((++x>2)||(++y>2))
            {
                x++;//=3
            }
        }
        System.out.println(x+" "+y);
    }
    }


