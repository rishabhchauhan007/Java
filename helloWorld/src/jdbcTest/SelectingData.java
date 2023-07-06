package jdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectingData {
    public static void main(String[] args) {
        try{
            Connection con = connectionProvider.getConnection() ;
            String query = "select * from TABLE1" ;
            Statement stmt = con.createStatement() ;
            ResultSet set = stmt.executeQuery(query) ;
            while( set.next() ) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);
                System.out.println(name + " : " + id + " : " + city);
            }
            con.close();
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }
}
