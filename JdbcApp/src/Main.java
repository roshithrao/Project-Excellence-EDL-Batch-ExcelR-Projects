import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class Main {

	public static void main(String[] args) throws SQLException {
//		1. import the package.[java.sql.*]
//
		//		2. Load(mysql-connector) and register the driver (Class.forName(com.mysql.jdbc.driver))
		Driver d = new Driver();
		DriverManager.registerDriver(d);

//				 3. Establish the connection between java application and database -> instantiating the Connection interface

		String url= "jdbc:mysql://localhost:3306/excelr_projects";
		String username ="root";
		String password = "root123";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
//				  4. Create the statements -> Statement(execute the query),PreparedStatement(execute the query with dynamic values),CallableStatement(Stored Procedures)

		Statement statement = con.createStatement();
//				  5. send and execute the query
		//executeQuery() -> Select commands
		//executeUpdate() -> DML commands
		//execute() -> Nested queries
		
	    ResultSet resultSet = statement.executeQuery("select * from student");
//
//				  6.Process the results from ResultSet
	    
	    
	    System.out.println("sid \t sname\t marks");
	    while(resultSet.next())
	    {
	    	int sid = resultSet.getInt(1);
	    	String sname = resultSet.getString(2);
	    	int marks = resultSet.getInt(3);
	    	System.out.println(sid+"\t "+sname+"\t "+marks);	
	    	
	    }
//
//				   7. Close the connection,statement and resultset objects
	    
	    con.close();
	    resultSet.close();
	    statement.close();
	
	}
	
	
}
