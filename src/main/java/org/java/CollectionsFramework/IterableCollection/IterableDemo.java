package org.java.CollectionsFramework.IterableCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
    // To Traverse the
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(); //List is Interface & ArrayList is Concrete/Legacy Class.
        values.add(2);
        values.add(5);
        values.add(9);
        values.add(22);

        System.out.println("List of Integer in ArrayList: "+ values);
        Iterator<Integer> listOfNumbers = values.iterator();
        while(listOfNumbers.hasNext()){                     // This method is from Iterator.
             int val = listOfNumbers.next();                // This method is from Iterator.
            System.out.println(val);
            if(val == 9){
                listOfNumbers.remove();
            }
        }
        for(int value: values){
            System.out.println("Remaining List of Integer in collection :" +value);
        }
    }
}
