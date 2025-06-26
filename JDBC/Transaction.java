import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Transaction {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="system";
		Connection con=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		String sqlquery1="update bank set balance=? where accountnumber=?";
		String sqlquery2="update bank set balance=? where accountnumber=?";
        try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(false);
			ps1=con.prepareStatement(sqlquery1);
			ps1.setInt(1, 8000);
			ps1.setInt(2, 1111);
			ps2=con.prepareStatement(sqlquery2);
			ps2.setInt(1, 2000);
			ps2.setInt(2, 1115);
			ps1.executeUpdate();
			ps2.executeUpdate();
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
