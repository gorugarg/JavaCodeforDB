// To make it work i have to add jar files in library path C:\Oracle\product\12.2.0\dbhome_1\jdbc\lib .Righ click on prject>properties>libaraypath

import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConnectToOracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		       
		      // print out the results
		      while(rset.next()) {
		        System.out.println(rset.getInt(1) + ", " +
		                           rset.getString(2)  + ", " +
		                           rset.getString(3)  + ", " +
		                           rset.getString(4));
		      }
		       
		    } catch (SQLException e) {
		      System.out.println(e.getMessage());
		    }
		  }
		}
