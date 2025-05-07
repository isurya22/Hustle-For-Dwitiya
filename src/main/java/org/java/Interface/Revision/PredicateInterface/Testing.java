package org.java.Interface.Revision.PredicateInterface;

public class Testing {
    public static void main(String[] args) {
        Predicate<Integer> checkEven = (Integer val) -> {
            if (val % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        boolean result = checkEven.test(23);
        System.out.println(result);
    }
}
