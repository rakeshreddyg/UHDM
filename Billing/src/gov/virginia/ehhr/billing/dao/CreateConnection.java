package gov.virginia.ehhr.billing.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class CreateConnection {
	
	String driverName = "oracle.jdbc.driver.OracleDriver";
	
	Connection con = null;
	String url = "jdbc:oracle:thin:@mitac1-scan.cov.virginia.gov:1521/appsdev.cov.virginia.gov";
	//String url = "jdbc:oracle:thin:@NG00205358:1521:xe";
	
	public Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url,"bill_dmas_app","BillDevApp12");
			//con = DriverManager.getConnection(url, "System", "system");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}