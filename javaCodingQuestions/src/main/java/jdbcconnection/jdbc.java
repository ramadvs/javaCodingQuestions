package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws SQLException {
		
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","c##rama","Innovapath1");
		
		Statement stmt = con.createStatement();
		
		String s = "SELECT FIRST_NAME FROM EMPLOYEES where SALARY=2500";
		
		ResultSet rs = stmt.executeQuery(s);
		
		
		while(rs.next())
		{
			String Name = rs.getString("FIRST_NAME");
			System.out.println(Name);
			
		}
		con.close();
	}

}
