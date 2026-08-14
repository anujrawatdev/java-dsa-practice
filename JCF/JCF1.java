package JCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class JCF1{
    public static void main(String [] args){
     ArrayList<Integer> list = new ArrayList<>();
     list.add(20);
     list.add(10);
     list.add(80);
     System.out.print(list);

   

     List<Integer> list2 = new ArrayList<>();
     list2.add(40);
     list2.add(50);

     list.addAll(list2);
     System.out.print(list);
     System.out.print(list.size());

     //i want to travel list using iterator
     Iterator<Integer> iterator = list.iterator();
     while(iterator.hasNext()){
        System.out.println("Element:" + iterator.next());
     }
    
     //toArray
     Object[] arr = list2.toArray();
     for(Object obj: arr){
        System.out.print(obj);
     }

     //sort an arrayList
     Collections.sort(list);
     System.out.println(list);
    }
}