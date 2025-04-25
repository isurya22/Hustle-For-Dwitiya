package org.java.fundamentals.Revision.Constructor;

public class Owners {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        //System.out.println(hotel);
        Hotel hotel1 = new Hotel("Swarnachuda");

        AllOdishaHotelAssociation aa = new AllOdishaHotelAssociation();
        AllOdishaHotelAssociation bb = new AllOdishaHotelAssociation("Mayfair");
        //Below if you have one parameter in constructor.
        System.out.println(bb.hotelName);
        AllOdishaHotelAssociation cc = new AllOdishaHotelAssociation("Swastik","Khorda",3);
        //If you want print like below then you will get object reference.
        System.out.println(cc);
    }
}
