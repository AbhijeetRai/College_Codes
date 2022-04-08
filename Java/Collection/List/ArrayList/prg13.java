import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ArrayListDemo {

	public static void main(String[] args) throws IOException {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Abhijeet");
		al.add("Zagade");
		al.add("Divya");
		al.add("Prashant");

		System.out.println("The current list is : " + al);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String you want to delete");
		String unwantedName = br.readLine();

		Iterator object = al.iterator();

		while(object.hasNext()) {

			String value = (String)object.next();

			if(value.equals(unwantedName)) {

				object.remove();
			}
		}

		System.out.println("The new list is : " + al);
	}
}
