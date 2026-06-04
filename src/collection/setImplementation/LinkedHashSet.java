package collection.setImplementation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> hashset =new java.util.LinkedHashSet<>();
        hashset.add(23);
        hashset.add(45);
        hashset.add(78);
        hashset.add(67);
        hashset.add(90);
        System.out.println(hashset);


        Set<Integer> hashset1 =new java.util.LinkedHashSet<>();
        hashset.add(78);
        hashset.add(56);
        hashset.add(12);
        hashset.add(14);
        System.out.println(hashset);
        hashset.addAll(hashset1);
        System.out.println(hashset1);
        System.out.println(hashset1.size());
        System.out.println(hashset.contains(100));
        System.out.println(hashset.remove(90));
       // System.out.println(hashset.isEmpty());
        //hashset.removeAll(hashset1);

        System.out.println(hashset);








    }
}
