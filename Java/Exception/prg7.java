//StackOverflow Error can be caught
class Demo {
	
	static void fun() {
		
		try {
			main(new String[] {});
		}catch(Throwable e) {
			
			System.out.println("Catch");
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		try {

				fun();
		}catch(Throwable e) {
			
			System.out.println("Main Catch");
			System.out.println(e);
		}
	}
}
