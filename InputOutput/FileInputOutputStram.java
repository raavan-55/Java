import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileInputOutputStram 
{
  public static void main(String[] args) 
    {
		try {
			String input="D:\\IO\\file input stream.txt";
			String output="D:\\IO\\file output stream.txt";
			FileInputStream inp=new FileInputStream(input);
			FileOutputStream outp=new FileOutputStream(output);
			
			int temp;
			while((temp=inp.read())!=-1) {
				System.out.print((char)temp+" ");
				outp.write(temp);
			}
	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
