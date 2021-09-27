package led_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dboperation {

	Connection con;
	Statement st;
	int val;
	
	public Dboperation() {
		//register driver type
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/batchb","root","rubinasql123");
			if (con!=null) {
				System.out.println("Database is connected sucessfully");
			
			}
			
			st= con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insert(String query) {
		
		try {
			val= st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return val;
	}

public static void main(String[] args) {
	
	new Dboperation();
}

public ResultSet select(String query) {
	// TODO Auto-generated method stub
	return null;
}
}
