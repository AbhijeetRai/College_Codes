class BritishMonarchy {

	{
		System.out.println("Instance block of British Monarchy");
	}

	BritishMonarchy() {
		
		System.out.println("Constructor of British Monarchy");
	}
}

class BritishConstitution extends BritishMonarchy {

	{
		System.out.println("Instance block of British Constitution");
	}

	BritishConstitution() {

		System.out.println("Constructor of British Constitution");
	}
}

class IndianConstitution extends BritishConstitution {

	{
		System.out.println("Instance block of Indian Constitution");
	}

	IndianConstitution() {

		System.out.println("Constructor of Indian Constitution");
	}
}

class Demo {

	public static void main(String[] args) {

		new IndianConstitution();
	}
}
