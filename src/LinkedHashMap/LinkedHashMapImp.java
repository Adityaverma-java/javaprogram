package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapImp {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("Employee Id",101);
        map.put("Address",234);
        map.put("Age",34);
        map.put("Phone Number",67000);
        map.put("Salary",45000);
        System.out.println(map);
        System.out.println(map.size());
        map.containsValue(234);
        System.out.println(map.containsValue(234));
        map.containsKey("Address");
        System.out.println(map.containsKey("Address"));
        map.hashCode();
        System.out.println(map.hashCode());

    }
}
