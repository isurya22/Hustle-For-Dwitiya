package org.java.Interface.Revision.ExampleWithAbstaraction;

public abstract class AndroidMobile implements Mobile{

    @Override
    public void doConversation(){
        System.out.println("This is by the default feature.");
    }

    abstract void doAnything();
}
