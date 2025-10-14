package org.java.CollectionsFramework.Map.E29Shriyansh;

import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> proposalCounts = new HashMap<>();
        proposalCounts.put(3,"S");
        proposalCounts.put(8,"B");
        proposalCounts.put(2,"P");
        proposalCounts.put(5,"L");
        proposalCounts.put(null,"A");
        proposalCounts.put(10,null);

        for(Map.Entry<Integer,String> entryMap : proposalCounts.entrySet()){
            Integer key  = entryMap.getKey();
            String values = entryMap.getValue();
            System.out.println("Keys: "+key+","+"Values: "+values);
        }
        //isEmpty
        System.out.println("Checking the data: "+proposalCounts.isEmpty());
        //Size
        System.out.println("Size: "+ proposalCounts.size());
        //containsKey
        System.out.println("ContainsKey: "+proposalCounts.containsKey(null));
        //get(Key)
        System.out.println("Get Key: "+proposalCounts.get(1));

    }
}
