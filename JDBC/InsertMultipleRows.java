import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRows {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="system";
		Scanner scan=null;
		Connection con=null;
		PreparedStatement ps=null;
		String sqlquery="insert into goods values(?,?,?,?,?)";
		scan=new Scanner(System.in);
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			ps=con.prepareStatement(sqlquery);
			System.out.println("Enter number of rows you want to insert");
			int rows=scan.nextInt();
			for (int i = 1; i <=rows; i++) {
//				int id=i;
//				String name=scan.next();
//				System.out.println("Enter the city");
//				String city=scan.next();
				ps.setInt(1, i+500);
				ps.setString(2, "60");
				ps.setString(3, "cf");
				ps.setString(4, "101");
				ps.setInt(5, 5);
				
				ps.addBatch();
			}
			ps.executeBatch();
			
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
