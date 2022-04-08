import java.io.*;

class Demo {

	public static void main(String[] args) {
		
		try {

			System.out.println(10 / 0);
			System.out.println("In try");
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


 class DemoNew {

 	public static void main(String[] args) {
 		
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 		String s = null;

 		try {

 			br.close();
 			s = br.readLine();
 		}catch(IOException e) {

 			System.out.println(e);
 		}

 		finally {

 			System.out.println("In finally");
 		}

 		for(int i = 1; i <= 3; i++)
 			System.out.println("Core2Web");
 	}
 }