package IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {

    public static void main(String[] args) {

        IdentityHashMap ihm = new IdentityHashMap();

        ihm.put("One", 1);
        ihm.put("Two", 2);
        ihm.put("Three", 3);
        ihm.put("Four", 3);
        ihm.put("Five", 2);
        ihm.put("Three", 1);

        Set set = ihm.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry example = (Map.Entry) i.next();
            System.out.println(example.getKey() + " : " + example.getValue());
        }
    }
}
