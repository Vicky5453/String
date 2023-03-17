package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException1 {

	public static void main(String[] args) throws FileNotFoundException {
		CheckedException1 ce = new CheckedException1();
        ce.FileRead();
	}

	public void FileRead() throws FileNotFoundException {
		 File f = new File("");
		  
		 FileReader fr = new FileReader(f);
		
		
	}

}
