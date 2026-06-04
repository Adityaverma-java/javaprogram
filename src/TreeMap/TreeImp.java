package TreeMap;

import java.util.TreeMap;

public class TreeImp {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new java.util.TreeMap<>();
        map.put("Led",34000);
        map.put("Car",23000);
        map.put("Bike",34000);
        map.put("Mobile",67000);
        System.out.println(map);
        System.out.println(map.size());
        map.containsValue(23000);
        System.out.println(map.containsValue(23000));
        map.containsKey("Led");
        System.out.println(map.containsKey("Led"));
        map.hashCode();
        System.out.println(map.hashCode());
        System.out.println(map.remove("Car"));
        


    }
}
