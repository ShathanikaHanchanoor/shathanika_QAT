package jdbc;

import java.beans.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="SYSTEM";
		String password="admin";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=(Connection) DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement stmt=(Statement) ((java.sql.Connection) con).createStatement();
		
		String updateQuery="UPDATE EMP SET dob='3/10/1799' WHERE id=3";
		((java.sql.Statement) stmt).executeUpdate(updateQuery);
		
		ResultSet rs=((java.sql.Statement) stmt).executeQuery("SELECT * FROM EMP");
		System.out.println("Query Execution"+rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("id")+":"+rs.getString("name")+":"+rs.getString("dob"));
		}
		con.close();

	}



	}



