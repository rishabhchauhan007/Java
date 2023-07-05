import java.util.* ;
class Employee implements Comparable{
    String name ;
    int eid ;
    Employee( String name , int eid){
        this.name = name ;
        this.eid = eid ;
    }
    public String toString(){ return name+" "+eid ;}
    @Override
    public int compareTo(Object o) {
        int eid1 = this.eid ;
        Employee e = ( Employee)o ;
        int eid2 = e.eid ;
        if( eid1 < eid2 ) return -1 ;
        else if( eid1 > eid2 ) return 1 ;
        else return 0 ;
    }
}

public class copy {
    public static void main(String[] args) {
        Employee e1 = new Employee("rishabh",1) ;
        Employee e2 = new Employee("saksham", 2 ) ;
        Employee e3 = new Employee("sarth", 3 ) ;
        Employee e4 = new Employee("yatharth", 4) ;
        Employee e5 = new Employee("akash", 5 ) ;
        TreeSet t1 = new TreeSet() ;
        t1.add(e1) ;
        t1.add(e2) ;
        t1.add(e3) ;
        t1.add(e4) ;
        t1.add(e5) ;
        System.out.println(t1);
        TreeSet t2 = new TreeSet( new myComparator() ) ;
        t2.add( e1 ) ;
        t2.add( e2 ) ;
        t2.add( e3 ) ;
        t2.add( e4 ) ;
        t2.add( e5 ) ;
        System.out.println(t2);
    }
}

class myComparator implements Comparator{
    public int compare( Object obj1 , Object obj2 ){
        Employee e1 = (Employee) obj1 ;
        Employee e2 = (Employee) obj2 ;
        String s1 = e1.name ;
        String s2 = e2.name ;
        return s1.compareTo(s2) ;
    }
}

