package org.java.ExceptionHandling.Revision.CheckedException.FinallyExample;

public class Demo {
    public static void main(String[] args) {
        try{
            method1("dummy");
        }
        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException Handled");
        }
        catch(Exception ex){
            System.out.println("Parent Exception handle");
        }
    }
    public static void method1(String name) throws Exception {
        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        } else if (name.equals("Raja")){
            throw new Exception();
        }
    }
}
