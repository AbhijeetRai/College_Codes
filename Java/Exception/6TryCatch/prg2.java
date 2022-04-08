/**
 * One try block can have multiple catches, but we should be careful about one thing, that parent is not being caught
 * in catch block above, the catch block of child.
 * This rule is obeyed for both checked and unchecked exceptions
 * Otherwise parent will catch everything and child gets to catch nothing and we will have error like 
 
 * exception IOException has already been caught
 */

/**
 * However there will be no issue, if parent catch block is below catch block of child 
 * or there are 'sibling' catch blocks one above each other
 */


import java.io.*;

class Demo {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of your favourite superhero Abhijeet");

		String name = null;

		try {
			
			name = br.readLine();
		}catch(IOException e) {
			
			System.out.println(e.toString());
		}catch(Exception e) {

			System.out.println(e.toString());
		}

		System.out.println("Abhijeet your favourite superhero is " + name);
	}
}
