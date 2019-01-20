import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;

public class Work {
   
        public static void main(String[] args){
    	try {
		      // create the Oracle DataSource and set the URL
		      OracleDataSource ods = new OracleDataSource();
		      ods.setURL("jdbc:oracle:thin:SYSTEM/qUw7o2c$$$@localhost:1521/oracle12cnew");
		       
		      // connect to the database and turn off auto commit
		      OracleConnection ocon = (OracleConnection)ods.getConnection();
		      ocon.setAutoCommit(false);
		       
		      // create the statement and execute the query
		      Statement stmt = ocon.createStatement();
		      ResultSet rset = stmt.executeQuery("select * from EMPLOYEE");
		      
		   // create the hashmap
		        HashMap<Integer,Hashamp> map = new HashMap<Integer,Hashamp>();
		        Hashamp u;       
        
            
            while(rset.next()){
                Integer id = rset.getInt(1);
                String fname = rset.getString(2);
                String skill = rset.getString(3);
                String  post = rset.getString(4);
                
                u = new Hashamp(id, fname,skill,post);
                map.put(id, u);
            }
        
        
        // display data from the hashmap
        for(Integer i : map.keySet()){
            Hashamp us = map.get(i);
            System.out.println(us.getId()+" "+us.getFname()+" "+us.getSkill()+" ");
        }
        
        // show data from hashmap using our ToString Method
        System.out.println("______With ToString______");
        for(Integer i : map.keySet()){
            Hashamp us = map.get(i);
            
        }
        
}catch(Exception ex){
    ex.printStackTrace();
}
}
}