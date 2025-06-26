import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class FetchingDataWithCondition {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="system";
		Scanner scan=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sqlquery="select * from student where id=?";
		scan=new Scanner(System.in);
		System.out.println("Enter the id :");
		int id=scan.nextInt();
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			ps=con.prepareStatement(sqlquery);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
				rs.close();
				scan.close();
				
				}
			catch(Exception e2) {
				e2.printStackTrace();
			}
		}	
	}
}
