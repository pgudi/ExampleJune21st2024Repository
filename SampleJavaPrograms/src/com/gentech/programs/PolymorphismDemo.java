package com.gentech.programs;
abstract class GeometricFigure
{
    abstract void area();
}
class Square extends GeometricFigure
{
    void area()
    {
        int side=7;
        System.out.println("Area of the Square :"+(side * side));
    }
}

class Rectangle extends GeometricFigure
{
    void area()
    {
        int length=16,breadth=7;
        System.out.println("Area of the Rectangle :"+(length * breadth));
    }
}

class Circle extends GeometricFigure
{
    void area()
    {
        double pi=3.14;
        double r=2.5;
        System.out.println("Area of the Circle :"+(pi * r * r));
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {

        new Circle().area();

        Circle o=new Circle();
        o.area();
//        GeometricFigure figure=null;
//
//        Square square=new Square();
//        Rectangle rectangle=new Rectangle();
//        Circle circle=new Circle();
//
//        figure=square;
//        figure.area();
//
//        figure=rectangle;
//        figure.area();
//
//        figure=circle;
//        figure.area();
    }
}
