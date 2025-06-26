import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class FetchingData {
	public static void main(String[] args) {
		try {
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="system";
			String password="system";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection established");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select*from emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
