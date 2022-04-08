import java.util.*;

/**
 * There are various laws in our nation 
 * which can be stored in one collection
 * @author Abhijeet Rai
 */

class Law {

	/**
     * main method is client side method
     * @exception no exception
     * @return no return  value
     */

	public static void main(String[] args) {
		

		/**
		 * Let Kashmir be one collection of different laws
		 * These laws provide special status to Kashmir
		 */
		ArrayList kashmir = new ArrayList();

		/**
		 * 35A is added to Kashmir 
		 */
		kashmir.add("35A");

		/**
		 * Article 370 is added to kashmir
		 */
		kashmir.add(370);

		System.out.println("\nThe special privileges of the kashmir are : " + kashmir);

		/**
		 * Let constitution be one collection of 
		 * various(different) laws, including the
		 * section of law, (integer value) and the
		 * name of the bill (string value).
		 * Hence let us do not add generic to 
		 * the constitution collection
		 * When constitution of our nation was created, 
		 * by default it gave special status to kashmir
		 * so add the collection of laws which give 
		 * special status to kashmir, in the constitution
		 * of our nation, while creating the constitution.
		 */
		ArrayList constitution = new ArrayList(kashmir);

		/**
		 * 144 is a section introduced by the british in india
		 * to avoid public gatherings and public meetings.
		 */
		constitution.add(144);

		/**
		 * 420 is section registered against fraud cases.
		 */
		constitution.add(420);

		System.out.println("The indian constitution intitally consisted of : " + constitution);

		/**
 		 * Recently government removed the special status of Kashmir
 		 * So clear the collection which gives special status to kashmir
 		 * and remove (delete) those laws from the constitution of nation
		 */

		kashmir.clear();
		System.out.println("The special privileges of the kashmir are now : " + kashmir);

		/**
		 * Check if the consitution of the nation contains, laws that give special
		 * privilege to the state of kashmir and delete those laws if present in constitution.
		 */

		if(constitution.contains("35A")) {

			/**
			 * 35A is present in constitution, look for its index
			 */
			int index = constitution.indexOf("35A");
			System.out.println("The index of 35A in the constitution is : " + index);

			/**
			 * Now remove 35A once its index is achieved
			 */

			/**
			 * There are two remove methods in the collection
			 * one removes the object and other removes object
			 * from the given index or position and shift rest 
			 * elements to the left, that is reduce indices of 
			 * rest of the elements by one.
			 */
			constitution.remove(index);
			System.out.println("After removal of 35 A : " + constitution);
		}

		/**
		 * Check if the consitution of the nation contains, laws that give special
		 * privilege to the state of kashmir and delete those laws if present in constitution.
		 */

		if(constitution.contains(370)) {

			/**
			 * 370 is present in constitution, look for its index
			 */
			int index = constitution.indexOf(370);
			System.out.println("The index of 370 in the constitution is : " + index);

			/**
			 * Now remove 370 once its index is achieved
			 */

			/**
			 * There are two remove methods in the collection
			 * one removes the object and other removes object
			 * from the given index or position. 
			 */
			constitution.remove(index);
			System.out.println("After removal of 370 : " + constitution);

			/**
			 * Let us make a new collection dealing with the citizenship 
			 * of people of india and laws relating to the citizenship.
			 * Let it only contain name(String) of the bills(laws).
			 */

			ArrayList<String> citizenship = new ArrayList<String> ();

			/**
			 * Let us add laws in the citizenship collection
			 */
			citizenship.add("CAB");
			citizenship.add("NRC");
			citizenship.add("CAA");


			System.out.println();
			System.out.println("The citizenship bill is : " + citizenship);
			System.out.println("constitution before citizenship bill is : " + constitution);


			/**
			 * Now let us add the collection of citizenship as a whole to the existing indian constitution
			 */

			constitution.addAll(citizenship);
			System.out.println("constitution after citizenship bill is : " + constitution);

			/**
			 * Same bill has to be passed in lok sabha and vidhan sabha as well
			 * The bill (object) is same, there are two refrences(copies) of it.
			 * So let us clone the citizenship bill
			 */

			ArrayList<String> vidhanSabha = (ArrayList<String>) citizenship.clone();
			System.out.println("The copy of the bill is : " + vidhanSabha);
		}
	}
}