import java.util.*;
import java.util.stream.IntStream;

public class Collections {
    public static void main(String[] args) {
   //     1
//        Collection list=new ArrayList<>() ;
//        IntStream.range(0,10).forEach(elem -> list.add(elem));
//
//        Iterator iterator=list.iterator();
//        while (iterator.hasNext()){
//           // System.out.println(iterator.next());
//            int it= (int) iterator.next();
//           if(it%2==0) System.out.println(it);
//            else iterator.remove();
//            ;
//        }
//        System.out.println(list);

        //2
//        List<Integer> list=new ArrayList<>() ;
//        IntStream.rangeClosed(1,20).forEach(elem -> list.add(elem));
//        for (int i = 0; i < list.size(); i++) {
//            if(i%2==0)list.set(i,10);
//            else list.set(i,20);

//            if(list.get(i)%2!=0)list.set(i,20);

//            if(list.get(i)%2!=0)list.remove(i);
//        }

        //3
        List list=new ArrayList<>() ;
        IntStream.rangeClosed(1,10).forEach(elem -> list.add(elem));
       list.add("a"); list.add("b");list.add("c");list.add("d");list.add("e");
       list.add("f");list.add("g");list.add("h");list.add("i");list.add("j");

      List listInt=new ArrayList();
      List listString=new ArrayList();

       for (int i = 0, j=0; i < list.size(); i++) {
           if (list.get(i) instanceof Integer) listInt.add(list.get(i));
           else listString.add(list.get(i));
       }
       list.clear();
       list.addAll(listString);
       list.addAll(listInt);

        System.out.println(list);
   }
}
