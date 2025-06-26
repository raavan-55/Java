import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {
		File file = new File("dir1/dir/one.txt");
		
		System.out.println(file);
		String path = file.getPath();
		File file2=new File(path);
		System.out.println(file2);
		 Path path1 = Paths.get("C:", "folder1/folder2/folder4", "test.txt");
		System.out.println(path1.subpath(0,3));

	}

}
