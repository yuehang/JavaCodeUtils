import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ZipSystemTest {
	public static void main(String[] args) throws IOException
	{
		FileSystem fs = FileSystems.newFileSystem(Paths.get("d:\\Users\\h_yue\\Desktop\\20151202\\20151202.zip"), null);
//		Files.copy(fs.getPath("1.txt"), "d:\\Users\\h_yue\\Desktop\\20151203\\");
		Files.copy(Paths.get("1.txt", null), Paths.get("d:\\Users\\h_yue\\Desktop\\20151203\\"));
	}
}
