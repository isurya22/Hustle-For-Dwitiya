package org.java.fundamentals.Revision.AbstractClassExample;

public class TATA extends Car {
            @Override
            public void applyAccelerator() {
                System.out.println("This feature is available.");
            }

            @Override
            public void applyBreak() {
                System.out.println("This Break feature is available.");
            }

    @Override
    public void fillGas(String Gas) {
        super.fillGas(Gas);
    }
  /*
     Below method haveDigitalMeter created it is not working. Because this concrete class is extends to abstract class.
     public void haveDigitalMeter(){
        System.out.println("Have digital Speed meter");
    }
   */

}

