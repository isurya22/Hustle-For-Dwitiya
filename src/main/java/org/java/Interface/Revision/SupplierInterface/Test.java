package org.java.Interface.Revision.SupplierInterface;

public class Test {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber = ()-> "Even Number is 2";
        System.out.println(isEvenNumber.get());

        /*
          Supplier<String> isEvenNumber = () -> {return "Even Number is 22"};
         */
    }
}
