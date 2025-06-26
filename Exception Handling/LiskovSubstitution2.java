import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class LiskovSubstitution22{
	
	static void method() throws Exception {
		System.out.println("first");
	}
}
public class LiskovSubstitution2 extends LiskovSubstitution22  {
	public static void method() throws SQLException{
		System.out.println("Overridden");

	}
	public static void main(String[] args) throws Exception {
		LiskovSubstitution22.method();
	}

}
