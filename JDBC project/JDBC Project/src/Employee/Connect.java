package Employee;
import java.sql.*;

public class Connect {
	public Connection c;
	public Statement s;
	
	public Connect() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c = DriverManager.getConnection("jdbc:mysql:///employee_management","root","VitBhopal@2019");
         s = c.createStatement();
		}
		catch (Exception e) {
			System.out.println(s);
		}
	}
	

}
