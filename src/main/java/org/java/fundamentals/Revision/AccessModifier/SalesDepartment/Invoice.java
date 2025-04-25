package org.java.fundamentals.Revision.AccessModifier.SalesDepartment;

public class Invoice {

    private int howManyInvoicePrint = 3;

    protected void showIncome(){
        System.out.println("Are we making profit or not ?");
    }

    public void getInvoice(){
        System.out.println("Print Invoice");
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.getInvoice();
        System.out.println(invoice.howManyInvoicePrint);
    }
}
