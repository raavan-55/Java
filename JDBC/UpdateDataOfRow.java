import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDataOfRow {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="system";
		Scanner scan=null;
		Connection con=null;
		PreparedStatement ps=null;
		//ResultSet rs=null;
		String sqlquery="update student set name=?,city=? where id=?";
		scan=new Scanner(System.in);
		System.out.println("Enter the id :");
		int id=scan.nextInt();
		System.out.println("Enter the name ");
		String name=scan.next();
		System.out.println("Enter the name ");
		String city=scan.next();
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			ps=con.prepareStatement(sqlquery);
			ps.setString(1,name);
			ps.setString(2,city);
			ps.setInt(3,id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				ps.close();
				con.close();
				scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}


	}

}
