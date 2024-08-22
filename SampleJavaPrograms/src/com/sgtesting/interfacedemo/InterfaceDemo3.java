package com.sgtesting.interfacedemo;
interface Employee
{
    default void showCityName(String name)
    {
        System.out.println("The City Name in Employee interface :"+name);
    }
}

interface Dept
{
    default void showCityName(String name)
    {
        System.out.println("The City Name in Dept interface :"+name);
    }
}

class Research implements Employee, Dept{
    @Override
    public void showCityName(String name)
    {
        System.out.println("The City Name is :"+name);
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Research o=new Research();
        o.showCityName("Bangalore");
    }
}
