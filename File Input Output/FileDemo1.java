package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File m = new File("/home/vicky/rock/FileIO/RAM");
//		boolean result =m.createNewFile();
//		System.out.println(result);
		
//		m = new File("/home/vicky/rock/FileIO");
//		result = m.mkdir();
//		System.out.println(result);
		
//		String[] name = m.list();
		
/*		for(String v:name )
		{
		//	System.out.println(v);
			if(v.endsWith(".java"))
				System.out.println(v);
		}
*/
/*		File[] a = m.listFiles();
		
		for(File s:a)
		{
	//		if(s.isDirectory())
			if(s.isFile())
			System.out.println(s);
		}
*/
		
		FileWriter writer = new FileWriter(m,true);
	/*	writer.write("\n");
		writer.write("balaji  12/07/1997");
		writer.flush();
		writer.close();
*/		
		FileReader reader = new FileReader(m);
		int content = reader.read();
	/*	System.out.println((char)content);
		 content = reader.read();
		System.out.println((char)content);
		 content = reader.read();
		System.out.println((char)content);
		 content = reader.read();
		System.out.println((char)content);
		 content = reader.read();
		System.out.println((char)content);
*/
		while(content!=-1)
		{
			System.out.print((char)content);
			content = reader.read();
		}
}
}
