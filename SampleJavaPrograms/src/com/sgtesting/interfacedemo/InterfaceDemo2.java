package com.sgtesting.interfacedemo;
interface Product2
{
    void showProductName(String name);
    static void showProductPrice(int price)
    {
        System.out.println("The price of the product :"+price);
    }
}

class ElctronicItem2 implements Product2
{
    public void showProductName(String name)
    {
        System.out.println("The Product Name :"+name);
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        ElctronicItem2 o=new ElctronicItem2();
        o.showProductName("Dell");
        Product2.showProductPrice(44000);
    }
}
