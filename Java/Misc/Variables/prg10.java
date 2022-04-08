class Demo {
	
	static int a = 10;

	static {
		
		System.out.println("Static of Demo");
	}
}

class Main {
	
	//The reason only static of Main wqs executed because, Even though Main.class and Demo.class files are on method area.
	//Demo.class is not being read yet.
	static {
		
		System.out.println("Static of Main");
	}

	public static void main(String[] args) {
		
		//System.out.println(Demo.a);
	}
}
