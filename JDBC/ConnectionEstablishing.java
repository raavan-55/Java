import java.sql.DriverManager;
public class ConnectionEstablishing {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("loaded the driver");
			
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			System.out.println("Connection established");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
