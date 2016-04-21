import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;


public class ZipTest {
	public static void main(String[] args)
	{
		try
		{
			readZipFile("d:\\Users\\h_yue\\Desktop\\20151202\\20151202.zip");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void readZipFile(String file) throws Exception
	{
		ZipFile zipFile = new ZipFile(file);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ZipInputStream zin = new ZipInputStream(in);
		ZipEntry ze;
		while((ze=zin.getNextEntry())!=null)
		{
			if(ze.isDirectory())
			{
				
			}
			else
			{
				System.err.println("file-"+ze.getName()+":"+ze.getSize()+"bytes");
				long size = ze.getSize();
				if(size>0)
				{
					BufferedReader reader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(ze)));
					String line;
					while((line=reader.readLine())!=null)
					{
						System.out.println(line);
					}
					reader.close();
				}
				System.out.println();
			}
		}
		zin.closeEntry();
	}
}
