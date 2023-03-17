package exceptionHandling;

public class User {     // connect the FileSizeIncorrectException

	public static void main(String[] args) {
		FileSizeIncorrectException fi = new FileSizeIncorrectException();
		try 
		{
			fi.checkFileSize(4);
		} 
		catch (FileSizeIncorrectException e) 
		{
			e.printStackTrace();
		}
	}

}
