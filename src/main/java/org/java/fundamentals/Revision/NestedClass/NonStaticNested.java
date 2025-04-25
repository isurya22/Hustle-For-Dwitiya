package org.java.fundamentals.Revision.NestedClass;

public class NonStaticNested {
    int referenceVariable = 10;
    static int classVariable = 20;

    class InnerClass{
      public void print(){
          System.out.println(referenceVariable+classVariable);
      }
    }

    public static void main(String[] args) {
        NonStaticNested obj = new NonStaticNested();
        NonStaticNested.InnerClass kr = obj.new InnerClass();
        kr.print();
    }
}
