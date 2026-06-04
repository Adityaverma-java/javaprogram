package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListImp {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(45);
        lst.add(23);
        lst.add(78);
        lst.add(12);
        lst.add(33);
        lst.add(67);
        lst.add(41);
        lst.add(89);
        lst.add(23);
        lst.add(78);
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
        lst.remove(4);
        System.out.println(lst);
        lst.addFirst(89);
        System.out.println(lst);        lst.addLast(78);
        System.out.println(lst);
        lst.get(4);
        System.out.println(lst.get(4));
        lst.size();
        System.out.println(lst.size());

      List<String> list=new ArrayList<>();
      lst.add(1);
      lst.add(2);
      lst.add(3);
      lst.add(4);
        System.out.println(lst);


    }

}
