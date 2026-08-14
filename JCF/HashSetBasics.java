package JCF;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    public static void main(String[] args) {
        // Set<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(20);
        // st.add(20);
        // st.add(30);

        // System.out.println(st);



        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        set1.add(10);
        set1.add(20);
        set1.add(30);

        set2.add(10);
        set2.add(50);
        set2.add(40);

        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));
    }
}
