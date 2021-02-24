import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MaxOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        Map<Integer, String> list = new ConcurrentHashMap<>();

        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(4);
        arrayList.add(28);
        arrayList.add(5);
        //============
        list.put(101,"ram");
        list.put(102,"Kumkum");
        list.put(103,"Vikash");

        //Collections.sort(arrayList);
        System.out.println(arrayList);
       // System.out.println(arrayList.size()-1);
       //int x= Collections.max(arrayList);
      // System.out.println(x);
        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //arrayList.add(34);
        }
        //=========
        for(Map.Entry m:list.entrySet()){
            System.out.println(m.getKey() +" " +m.getValue());
            list.put(104,"Manu");
        }
    }
}
