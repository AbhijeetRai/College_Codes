/**
 * A program to show that, it is possible to write nested try-catch in try block too and catch block too.
 */

import java.io.*;

class Demo1 {
	
	public static void main(String[] args) {
		
		try {
			
			try {	
				
				System.out.println(10 / 0);
			}catch(ArithmeticException e1) {
				
				System.out.println("Catch - 1");
			}

			System.out.println(10 / 0);
		}catch(ArithmeticException e2) {
			
			System.out.println("Catch - 2");

			try {
				
				System.out.println(10 / 0);
			}catch(ArithmeticException e3) {
				
				System.out.println("Catch - 3");
			}
		}
	}
}

class Demo2 {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			br.close();
			
			try {
				
				br.readLine();
			}catch(IOException e1) {
				
				System.out.println("Catch - 4");
			}

			br.readLine();
		}catch(IOException e2) {
			
			System.out.println("Catch - 5");

			try {
				
				br.readLine();
			}catch(IOException e3) {
				
				System.out.println("Catch - 6");
			}
		}
	}
}
