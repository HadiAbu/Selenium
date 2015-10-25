package MainPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesShit
{
	//for character stream reading
	private FileReader fileReader;
	private BufferedReader buffReader;
	//for character stream writing
	private FileWriter fileWriter;
	private BufferedWriter buffWriter;

	//for binary stream reading
	private FileInputStream fis;
	//for binary stream writing
	private FileOutputStream fos;
	
	public FilesShit() throws IOException
	{
//		initReaders();
		initWriters();
	}
	public void initReaders() throws IOException{
		fileReader = new FileReader("C:\\Users\\Galil1\\Documents\\Hadi\\myfile.txt");
		fis = new FileInputStream("C:\\Users\\Galil1\\Documents\\Hadi\\myBinfile.dat");
	}
	public void initWriters() throws IOException{
		fileWriter = new FileWriter("C:\\Users\\Galil1\\Documents\\Hadi\\myfile.txt");
		fos = new FileOutputStream("C:\\Users\\Galil1\\Documents\\Hadi\\myBinfile.dat");
	}
	public void WriteStream()
	{
		
	}
	public void WriteCharacters(String s) throws IOException
	{
		fileWriter.write(s);
	}
	public void CloseFiles() throws IOException
	{
//		fileReader.close();
		fis.close();
		fileWriter.close();
		fos.close();
	}
	protected void finialize() throws Throwable
	{
		super.finalize();
		fileReader.close();
		fis.close();
		fileWriter.close();
		fos.close();
	}
	public static void main(String []args) throws IOException{
		System.out.println("Hello World!");
		FilesShit fs = new FilesShit();
		fs.WriteCharacters("Hello World!");
		fs.CloseFiles();
	}
}
