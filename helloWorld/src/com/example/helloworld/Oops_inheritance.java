package com.example.helloworld;

interface A{
    public void print_A() ;
}
interface B{
    public void print_B() ;
}

interface C extends A , B{
    public void print_C() ;
}

interface D{
    public void print_D() ;
}

class Child implements C,D{
    @Override
    public void print_C(){
        System.out.println("this is C");
    }
    public void print_for(){
        System.out.println("this is for");
    }
    @Override
    public void print_A() {
        System.out.println("this is A");
    }

    @Override
    public void print_B() {
        System.out.println("this is B");
    }

    @Override
    public void print_D() {
        System.out.print("this is D");
    }
}

public class Oops_inheritance {
    public static void main(String[] args) {
        Child c = new Child() ;
        c.print_C();
        c.print_for();
        c.print_A();
        c.print_B();
        c.print_D() ;
    }
}
