/**
 * Run time exceptions show full path while reporting an runtime exception like
 *
 * Exception in thread "main" 
 * java.lang.ArrayIndexOutOfBoundsException: (full path is shown on terminal)
 *
 * Index 0 out of bounds for length 0 at Demo.main(prg2.java:5)
 */
class Demo {
	
	public static void main(String[] args) {
		
		System.out.println(args[0]);
	}
}
