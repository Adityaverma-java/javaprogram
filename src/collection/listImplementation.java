package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class listImplementation {
    public static void main(String[] args) {
        //List creation
        List<String> lst = new ArrayList<>();
        //add object in the List
        lst.add("ankit");
        lst.add("aditya");
        lst.add("sourabh");
        lst.add("vishal");
        lst.add("sameer");
        System.out.println(lst);
        lst.size();
        System.out.println(lst.size());
        lst.contains("Ankit");
        System.out.println(lst.contains("Ankit"));
        lst.add(1,"Ankit");
        System.out.println(lst);


    }
}
