package org.java.fundamentals.Practice.AccessModifier.MarketingDepartment;

import org.java.fundamentals.Practice.AccessModifier.SalesDepartment.Invoice;

public class ProductX extends Invoice{

    public void sellProduct(){
        System.out.println("Product Sold");
        showIncome();  // Under User-defined Method we have to declare that protected method.
    }

    public static void main(String[] args) {
        ProductX x = new ProductX();
        x.sellProduct();
        Invoice invoice = new Invoice();
        invoice.getInvoice();
        /*
           If in SalesDepartment package Class Invoice I can make variable Public then I can call.
         */
        //System.out.println(invoice.howManyInvoicePrint);

    }
}
