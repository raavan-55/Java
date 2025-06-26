import java.io.File;

public class FileClass {
public static void main(String[] args) {
	try {
	String path="D:\\IO\\buffered reader.txt";
	File f=new File(path);
	System.out.println(f.exists());
	System.out.println(f.isFile());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.canExecute());
	System.out.println(f.getCanonicalPath());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getParent());
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
