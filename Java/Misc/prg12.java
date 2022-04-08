//final methods cannot be overridden
class Parent {
	
	final void property() {
		
		System.out.println("Save and acquire property");
	}
}

class Child extends Parent {
	
	void property() {
		
		System.out.println("Spend and sell property");
	}
}
