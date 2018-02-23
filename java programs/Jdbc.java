package in.oops;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Formatter;


public class Jdbc {
	public static void main(String[] args) throws Throwable {
		Connection con = null;
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//connect to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_connection","root", "");
			//write sql qurey
			String sql = "SELECT * FROM jdbc_connection.prem";
			// prapare statement   
			Statement ps = con.prepareStatement(sql);
			//execute query
			java.sql.ResultSet re = ps.executeQuery("SELECT * FROM jdbc_connection.prem");
			//get the data result
			while (re.next()) {
				System.out.println(re.getInt(1) + re.getString(2) + re.getString(3));	
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//clode db con
		con.close();

	}

}
