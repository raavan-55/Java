import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderFileWriter {
	public static void main(String[] args) {
		try {
		String inputpath="D:\\IO\\file reader.txt";
		String outputpath="D:\\IO\\file writer.txt";
		FileReader fr=new FileReader(inputpath);
		FileWriter fw=new FileWriter(outputpath);
		int temp;
		while((temp=fr.read())!=-1){
			fw.write(temp);
		}
		fw.flush();
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
