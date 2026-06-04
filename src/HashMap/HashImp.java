package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashImp {
    public static void main(String[] args) {
        Map<String,Integer> map=new java.util.HashMap<>();
        map.put("Employee ID",247);
        map.put("Address",123);
        map.put("age",56);
        map.put("Experience",0);
        map.put("Salary",30000);
        map.put("Phone Number",456);
        System.out.println(map);
        System.out.println(map.size());
        map.containsValue(56);
        System.out.println(map.containsValue(56));
        map.containsKey("Address");
        System.out.println(map.containsKey("Address"));
        map.hashCode();
        System.out.println(map.hashCode());

        System.out.println(map.remove("age"));
        map.forEach((key,value)->
        {
            System.out.println(key+"---"+value);
        });

    }

}
