package com.example.helloworld;


//1 class myThread extends Thread{
//    public void fun(){
//        try {
//            for( int i = 0 ; i < 10 ; i++ ){
//                System.out.println("unforgiven3");
//                Thread.sleep(1000);
//            }
//        }
//        catch( InterruptedException i ){
//
//        }
//    }
//}

//2
//class myThread extends Thread{
//    @Override
//    public void start() {
//        System.out.println("start method");
//    }
//    public void run(){
//        System.out.println("run method");
//    }
//}

import java.awt.*;

//class curr implements Runnable{
//    @Override
//    public void run() {
//        int a = 5 ;
//        int b = 10 ;
//        int c = 5 + 10 ;
//        System.out.println( c );
//        for ( int i = 0 ; i < 5 ; i++ ){
//            System.out.println("this is child thread");
//        }
//    }
//}
//class thr extends Thread{
//    public void run(){
//        String n = Thread.currentThread().getName() ;
//        for( int i = 0 ; i < 5 ; i++ ){
//            System.out.println(n);
//        }
//    }
//}

class test extends Thread{
    @Override
    public synchronized void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class threadPractical {
    public static void main(String[] args) {
        test t1 = new test() ;
        test t2 = new test() ;
        test t3 = new test() ;
        t1.start();
        t2.start();
        t3.start() ;
        t1.setPriority(7);
        t2.setPriority(1);
        t3.setPriority(3);
    }
//    public static void main(String[] args) {
//        thr t1 = new thr() ;
//        thr t2 = new thr() ;
//        thr t3 = new thr() ;
//
//        t1.setName("thread 1");
//        t2.setName("thread 2");
//        t3.setName("thread 3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//    public static void main(String[] args) throws InterruptedException {
//        curr r = new curr() ;
//        Thread t = new Thread(r) ;
//        t.start();
//        System.out.println("this is main thread");
//        for( int i = 0 ; i < 10 ; i++ ){
//            System.out.println(100);
//            Thread.sleep(1000) ;
//        }
//    }
    //2
//    public static void main(String[] args) {
//        myThread t = new myThread() ;
//        t.start();
//        System.out.println("main method");
//    }
//    1
//    public static void main(String[] args) throws InterruptedException{
//        myThread t = new myThread() ;
//        t.fun();
//        for ( int i = 0; i < 5 ; i++ ){
//            System.out.println("sentinel");
//            Thread.sleep(1000);
//        }
//    }

}
