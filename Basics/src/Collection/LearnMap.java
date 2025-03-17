package Collection;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<String, Integer> num = new HashMap<>();

        num.put("One",1);
        num.put("Two", 2);
        num.put("Three", 3);

//        In this we can not put two value in the same key, If we do this, It
//        Override and replace the latest putted value in that same key.

//        num.put("One", 4);

//        To avoid this we can add like this
//        if(!num.containsKey("One")){
//            num.put("One",4);
//        }

        //        OR

        num.putIfAbsent("One",4);

        System.out.println("Mapped Elements in Array = "+num);

        System.out.println("Check that It contains the Given Value = "+num.containsValue(4));
        System.out.println("Check Set is Empty = "+num.isEmpty());
        num.remove("Three");

        System.out.println(num);

//        To iterate this array
        for(Map.Entry<String,Integer> e : num.entrySet()){
            System.out.println("Objects = "+e);

            System.out.println("Object's keys = "+e.getKey());

            System.out.println("Object's Values = "+e.getValue());
        }
    }
}
