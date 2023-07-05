package com.example.helloworld;

abstract class Shape{
    String color ;
    abstract double area();
    abstract double vol() ;
    public abstract String toString() ;
    public Shape( String color ){
        System.out.println("shape constructor called");
        this.color = color ;
    }
    public String getColor(){ return color ; }

}

class Circle extends Shape{
    double radius ;
    String color ;
    public Circle( String color , double radius ){
        super( color ) ;
        System.out.println("Circle contructor called :");
        this.radius = radius ;
    }
    @Override
    double vol(){
        return (4*Math.PI*Math.pow(radius,3))/3 ;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2) ;
    }

    public String toString(){
        return "the color of the circle is : " + super.getColor()
                + "the area of the circle is : " + area() ;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    @Override double vol(){
        return length*length*width ;
    }
    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}

public class Oops_abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle("red" , 2.2 ) ;
        Shape s2 = new Rectangle("blue" , 5.2 , 9.4 ) ;
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
