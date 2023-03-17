package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		CheckedException ce = new CheckedException();
		ce.readfile();
		  
	}

	public void readfile() {
		 File f = new File("");
		   try 
		   {
			FileReader fr = new FileReader(f);
		} 
		   catch (FileNotFoundException e) 
		   {
			e.printStackTrace();
		}

	}
}
