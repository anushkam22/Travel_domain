package DBUtility.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

public class DataBaseUtils {

	Connection con;

	public void getConnection(String username, String url, String password) throws Throwable {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet CreateQuery(String query) {
		ResultSet set = null;
		try {
			Statement stat = con.createStatement();
			set = stat.executeQuery(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return set;
	}

	public int UpdateQuer(String query) {
		int i = 0;
		try {
			Statement stat = con.createStatement();
			i = stat.executeUpdate(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;

	}

	public void closeConnection() throws SQLException
	{
		con.close();
	}
}
