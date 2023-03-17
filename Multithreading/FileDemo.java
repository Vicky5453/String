package fileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("/home/vicky/Documents/File IO/vicky.txt");
		boolean result = f.createNewFile();
		System.out.println(result);

		f = new File("/home/vicky/Documents/File IO/NEW");
		result = f.mkdir();
		System.out.println(result);

		f = new File("/home/vicky/Documents/File IO");
		result = f.mkdirs();
		System.out.println(result);

    	f.canExecute();
		f.canRead();
		f.canWrite();
		System.out.println(f.exists());
		System.out.println(f.lastModified());

		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());

	}

}
