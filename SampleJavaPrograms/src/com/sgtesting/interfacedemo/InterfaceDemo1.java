package com.sgtesting.interfacedemo;
interface Product
{
    void showProductName(String name);
    default void showProductPrice(int price)
    {
        System.out.println("The price of the product :"+price);
    }
}

class ElctronicItem implements Product
{
    public void showProductName(String name)
    {
        System.out.println("The Product Name :"+name);
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        ElctronicItem o=new ElctronicItem();
        o.showProductName("Lenovo");
        o.showProductPrice(25000);
    }
}
