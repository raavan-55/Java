import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderClass {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a string");
		InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(isr);
		int ch;//=isr.read();
		while((ch=isr.read())!=-1) {
			System.out.println((char)isr.read());
		}
		
		//System.out.println((char)ch);
		//System.out.println(br.markSupported());
		//String all =br.readLine();
		//System.out.println(all);

	}

}
