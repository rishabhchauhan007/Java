package com.example.helloworld;
//class student{
//    private String name ;
//    private int roll_no ;
//    public String getName(){
//        return name ;
//    }
//    public void setRoll_no( int roll_No){
//        this.roll_no = roll_No ;
//    }
//}

abstract class account{
    private String account_number ;
    private double balance ;
    public account( String account_number , double balance ){
        this.account_number = account_number ;
        this.balance = balance ;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount_number(){
        return account_number ;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit( double amount );
    public abstract void withdraw( double amount );
}

class savings_account extends account{
    savings_account(String account_number , double balance ){
        super( account_number , balance );
    }

    @Override public void deposit( double amount ){
        setBalance( getBalance()+ amount );
        System.out.println( "deposit of amount " + amount + "successful, with remaining balance: " + getBalance());
    }

    @Override public void withdraw( double amount ){
        if( getBalance() < amount ){
            System.out.println("not enough balance");
        }
        else{
            setBalance( getBalance() - amount );
            System.out.println("withdrawal of amount: " + amount+ "successfull, with remaining balance: " + getBalance());
        }
    }

}
//abstract class Animal{
//    abstract void sound() ;
//}
//
//class lion extends Animal{
//    @Override
//    void sound(){
//        System.out.println("roar");
//    }
//}
//
//class Tiger extends Animal{
//    @Override
//    void sound(){
//        System.out.println("roar2");
//    }
//}

public class jvmWorking {
    public static void main(String[] args) {
        savings_account s1 = new savings_account("102bf2143", 10000.234) ;
        s1.getBalance() ;
        s1.withdraw(2000.1242);
        s1.deposit(3200000.1431);
//        Tiger t = new Tiger() ;
//        lion l = new lion() ;
//        t.sound();
//        l.sound();
    }
//    public static void main(String[] args) {
//        Student s = new Student() ;
//        Class c = s.getClass() ;
//        System.out.println(c.getName());
//        Method[] m = c.getDeclaredMethods() ;
//        for( int i = 0 ; i < m.length ; i++ ){
//            System.out.println(m[i]);
//        }
//        Field[] f = c.getDeclaredFields() ;
//        for( int i = 0 ; i < f.length ; i++ ){
//            System.out.println(f[ i ]);
//        }
//    }
}
