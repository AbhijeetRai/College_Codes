class Custom {

	private String name = "Shane Watson";

	String fun() {

		//it is okay to return private variables
		return name;
	}
}

class Demo {

	static public String n;

	public static void main(String[] args) {

		Custom C = new Custom();
		n = C.fun();
		System.out.println(n);
	}
}
