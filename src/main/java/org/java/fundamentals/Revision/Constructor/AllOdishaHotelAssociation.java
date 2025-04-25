package org.java.fundamentals.Revision.Constructor;

/*
   In this I practiced types of constructor only I have not practiced the Copy Constructor.
 */

public class AllOdishaHotelAssociation {

    String hotelName;
    String district;
    int rating;

    //Default Constructor(No-Argument Constructor)
    AllOdishaHotelAssociation(){
        System.out.println("Default/No-args Constructor");
        /*
            This is Constructor Chaining where you can do with help of this() method.
         */
        //this("Taj");
    }

    //Parameterized Constructor
    AllOdishaHotelAssociation(String hotelName){
        this.hotelName = hotelName;
        /*
            This is Constructor Chaining where you can do with help of this() method.
         */
        //this("Taj","Mumbai",5);
    }

    //Constructor overloading is possible.
    AllOdishaHotelAssociation(String hotelName,String district, int rating){
        this.hotelName = hotelName;
        this.district = district;
        this.rating = rating;

        System.out.println("Hotel Name is: "+hotelName);
        System.out.println("District is: "+district);
        System.out.println("Rating is: "+rating);
    }
}
