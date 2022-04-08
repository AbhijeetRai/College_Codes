import java.io.*;
class Demo {
	
	public static void main(String[] args) {
		
		try {
			
			throw new ArithmeticException();
		}catch(Exception | IOException obj) {
			

		}catch(ArrayIndexOutOfBoundsException | IndexOutOfBoundsException e) {

		}
	}
}

/**
 * In union block, we cannot put parent child together
 */
