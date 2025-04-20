package org.java.fundamentals.Practice;

public class MemoryManagement {
    public static void main(String[] args) {
        //Stack and Heap Memory
        int variable1 = 22;
        String variable2 = "Lopa";
        NormalClassObject variable3 = new NormalClassObject();
        MemoryManagement variable4 = new MemoryManagement();
        variable4.dummyMethod(variable3);
    }
    private void dummyMethod(NormalClassObject variable3){
        NormalClassObject variable5 = variable3;
        String variable6 = "Jaga";
        String variable7 = new String("Naba");
    }
}
