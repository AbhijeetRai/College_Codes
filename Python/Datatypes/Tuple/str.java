// three diiferent objects are being pointed by s

class Str {

	public static void main(String[] args) {
		
		String s = "Shashi";

			System.out.println(s);
			System.out.println(System.identityHashCode(s));	

			s = s.concat("Bagal");
			System.out.println(s);
			System.out.println(System.identityHashCode(s));	

		s = "Kanha";

			System.out.println(s);
			System.out.println(System.identityHashCode(s));
	}
}