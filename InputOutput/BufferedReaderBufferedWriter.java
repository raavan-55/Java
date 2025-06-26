import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderBufferedWriter {

	public static void main(String[] args) {
		try {
			String inputpath="D:\\IO\\buffered reader.txt";
			String outputpath="D:\\IO\\buffered writer.txt";
			FileReader fr=new FileReader(inputpath);
			FileWriter fw=new FileWriter(outputpath);
            BufferedReader br=new BufferedReader(fr);
            BufferedWriter bw=new BufferedWriter(fw);
			int temp;
			while((temp=br.read())!=-1){
				bw.write(temp);
			}
			bw.flush();
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
