import java.util.*;

class Demo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Rahul");
		al.add("Rajesh");
		al.add("Kanha");
		al.add("Datta");
		
		ListIterator itr = al.listIterator();

		while(itr.hasNext()) {

				String s = (String)itr.next();

				if(s.equals("Kanhaiya")) {

					System.out.println("Hi");
				}

				if(s.equals("Rajesh")) {

					itr.remove();
				}

				else if(s.equals("Datta")) {

					itr.add("Ashish");
				}

				if(s.equals("Kanha")) {

					itr.add("Kanhaiya");
					//System.out.println("debug: in if ---------"+al);
				}
		}

		System.out.println(al);
	}
}
