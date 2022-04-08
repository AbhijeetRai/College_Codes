import java.io.*;

/**
 * Big Brain Obeservation (Hahahaha, I am genius)...
 * Exception handling is all about mainting flow of program, if exception is caught or handled
 * everything will be executed one by one in sequnece

 * or that method will be anormally terminated except only 'finally' will be executed before termination.
 */

class Demo {

	public static void main(String[] args) {
		
		try {

			System.out.println(10 / 0);
		}catch(IndexOutOfBoundsException e) {

			System.out.println(e);
		}

		finally {

			System.out.println("In finally");
		}

		for(int i = 1; i <= 3; i++)
			System.out.println("Core2Web");
	}
}

class DemoNew {

	public static void main(String[] args) throws IOException {
 		
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 		String s = null;

 		try {

 			br.close();
 			s = br.readLine();
 		}catch(ArithmeticException e) {

 			System.out.println(e);
 		}

 		finally {

 			System.out.println("In finally");
 		}

 		for(int i = 1; i <= 3; i++)
 			System.out.println("Core2Web");
 	}

}

