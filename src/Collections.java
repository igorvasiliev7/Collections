import javax.swing.text.html.HTMLDocument;
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
//        List list=new ArrayList<>() ;
//        IntStream.rangeClosed(1,10).forEach(elem -> list.add(elem));
//       list.add("a"); list.add("b");list.add("c");list.add("d");list.add("e");
//       list.add("f");list.add("g");list.add("h");list.add("i");list.add("j");
//
//      List listInt=new ArrayList();
//      List listString=new ArrayList();
//
//       for (int i = 0, j=0; i < list.size(); i++) {
//           if (list.get(i) instanceof Integer) listInt.add(list.get(i));
//           else listString.add(list.get(i));
//       }
//       list.clear();
//       list.addAll(listString);
//       list.addAll(listInt);
//
//        System.out.println(list);

        //4
//        List<Integer> listInt=new ArrayList<>() ;
//        IntStream.rangeClosed(1,10).forEach(elem -> listInt.add(elem));
//        List<String> list=new ArrayList<>() ;
//       list.add("a"); list.add("b");list.add("c");list.add("d");list.add("e");
//       list.add("f");list.add("g");list.add("h");list.add("i");list.add("j"); list.add("j");
//
//       Set <Integer> setInt=new HashSet<>(listInt);
//       Set <String> setString=new HashSet<>(list);

//        Set<Integer> setInt=new HashSet<>() ;
//        IntStream.rangeClosed(1,10).forEach(elem -> setInt.add(elem));
//        Set<String> setString=new HashSet<>() ;
//        setString.add("a"); setString.add("b");setString.add("c");setString.add("d");setString.add("e");
//        setString.add("f");setString.add("g");setString.add("h");setString.add("i");setString.add("j");
//        setString.add("i");setString.add("j");
//
//        List <Integer> listInt=new ArrayList<>(setInt);
//       List <String> listString=new ArrayList<>(setString);
//
//        System.out.println(listInt); System.out.println(listString);

        Map map=new HashMap();
        IntStream.rangeClosed(1,10).forEach(elem->map.put(elem,elem));
        map.put(11,"a"); map.put(12,"b");map.put(13,"c");map.put(14,"d");map.put(15,"e");
        map.put(16,"f");map.put(17,"g");map.put(18,"h");map.put(19,"i");map.put(20,"j");

        List<Integer> listI=new ArrayList<>();
        List<String> listS=new ArrayList<>();

        Iterator it=map.keySet().iterator();
       while (it.hasNext()){
         int key= (int) it.next();
         Object valO=map.get(key);

           System.out.println(key+" "+valO+", ");

         if(valO instanceof String) listS.add(valO.toString());
         else listI.add((int) valO);
       }

        System.out.println(listI);
        System.out.println(listS);

   }
}
