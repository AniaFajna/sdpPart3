import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static String URL = "jdbc:postgresql://localhost/JDBC";

	private static String USER = "postgres";

	private static String PASSWORD = "root";

	public static Connection connect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Baza danych została połączona");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
