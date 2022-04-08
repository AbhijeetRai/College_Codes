/**
 * One try block can have multiple catches, but we should be careful about one thing, that parent is not being caught
 * in catch block above, the catch block of child.
 * This rule is obeyed for both checked and unchecked exceptions
 * Otherwise parent will catch everything and child gets to catch nothing and we will have error like 
 
 * exception IOException has already been caught
 */


import java.io.*;

class Demo {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of your favourite superhero Abhijeet");

		String name = null;

		try {
			
			name = br.readLine();
		}catch(Exception e) {
			
			System.out.println(e.toString());
		}catch(IOException e) {

			System.out.println(e.toString());
		}
	}
}
