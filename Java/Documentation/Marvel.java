/**
 * A class to print some details about Marvel Comics and Marvel Cinematic Universe
 * @author Abhijeet Rai
 */

public class Marvel {
	
	/**
	 * A method to return the name of some movies from marvel
	 * @return String array of movies 
	 */
	public String[] movies() {

		return new String[] {"Iron Man", "Captain America"};
	}

	/**
	 * Main method is often client side method.
	 * @param String Array
	 */
	public static void main(String[] args) {

		Marvel marvelObject = new Marvel();
		System.out.println(marvelObject.movies());
	}
}
