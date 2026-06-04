package collection.setImplementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(25);
        set.add(23);
        set.add(56);
        set.add(78);
        set.add(56);
        set.add(34);
        set.add(90);

        Set<Integer> set1 =new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        //set.addAll(set1);
        //System.out.println(set);
        System.out.println(set1.size());
        System.out.println(set.size());
      //  System.out.println(set.contains(99));
      //  System.out.println(set.contains(23));
      //  System.out.println(set.remove(23));
      //  System.out.println(set);
      //  System.out.println(set.isEmpty());
      //  set.removeAll(set1);
       // System.out.println(set1);
        //set.clear();
       // System.out.println(set);
        System.out.println(set);
        Iterator<Integer> itr =set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
