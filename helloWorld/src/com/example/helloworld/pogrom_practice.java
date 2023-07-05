package com.example.helloworld;
import java.util.Arrays ;
//class myThread extends Thread{
//    public void run(){
//        System.out.println("hello world");
//    }
//}
//class odd implements Runnable{
//    public void run(){
//        for( int i = 1 ; i <= 20 ; i += 2 ){
//            System.out.print(i+" ");
//        }
//    }
//}
//
//class even implements Runnable{
//    public void run(){
//        for( int i = 0 ; i <= 20 ; i += 2 ){
//            System.out.print(i + " ");
//        }
//    }
//}

public class pogrom_practice {
    private static final int Array_Size = 400 ;
    private static final int num_threads = 4 ;
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Before sorting: " + Arrays.toString(array));
//        odd o = new odd() ;
//        Thread t1 = new Thread(o) ;
//        even e = new even() ;
//        Thread t2 = new Thread(e) ;
//        t1.start();
//        t2.start();
//        myThread t1 = new myThread() ;
//        t1.start();
//        ArrayList ar = new ArrayList() ;
//        ar.add("Student 2 ") ;
//        ar.add("Student 3 ") ;
//        ar.add("Student 4 ") ;
//        ar.add("Student 5 ") ;
//        ar.add("Student 6 ") ;
//        ar.add("Student 7 ") ;
//        ar.add("Student 8 ") ;
//        ar.add("Student 9 ") ;
//        ar.add("Student 10 ") ;
//        ar.add("Student 11 ") ;
//        System.out.println(ar);
//        for( Object o : ar ){
//            System.out.println(o);
//        }
    }
    private static int[] createArray(){
        int[] array = new int[Array_Size] ;
        for( int i = 0 ; i < Array_Size ; i++ ){
            array[ i ] = (int)( Math.random()*400) ;
        }
        return array ;
    }
}
