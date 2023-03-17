package exceptionHandling;

public class FileSizeIncorrectException extends Exception {  //user defined exception

	public static void main(String[] args) {
		

	}
	
	public void checkFileSize(int size) throws FileSizeIncorrectException
	{
		if(size<3)
		{
			FileSizeIncorrectException ff = new FileSizeIncorrectException();
			throw ff;
		}
	}

}
