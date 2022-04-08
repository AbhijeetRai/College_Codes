import java.util.*;

class ITCompany {

	String compName = null;
	int totEmp = 0;

	ITCompany(String compName, int totEmp) {

		this.compName = compName;
		this.totEmp = totEmp;
	}

	void display() {

		System.out.println("Company Name : " + compName + " Total Employee : " + totEmp);
	}
}

class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add(new ITCompany("BiEncaps",25));
		l.add(new ITCompany("Core2Web",30));

		/**
		 * This is showing address of two objects of ITCompany
		 */
		System.out.println(l);

		/**
		 * This is showing address of two objects of ITCompany
		 */

		for(Object o : l) {

			System.out.println(o);
		}

		/**
		 * Perhaps we can use cursor
		 */

		Iterator object = l.iterator();

		while(object.hasNext()) {

			System.out.println(object.next());
		}

		Iterator iobject = l.iterator();

		while(iobject.hasNext()) {

			ITCompany ITobject = (ITCompany)iobject.next();
			ITobject.display();
		}

		ListIterator itr = l.listIterator();

		while(itr.hasNext()) {

			ITCompany obj = (ITCompany)itr.next();
			obj.display();
		}

	}
}
