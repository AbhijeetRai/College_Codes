import java.io.*;

class Demo {

	public static void main(String[] args) {

		try {

			System.out.println(10 / 0);
			System.out.println("In try");
		}

		finally {

			System.out.println("Clean-Up");
		}

		for(int i = 1; i <= 3; i++)
			System.out.println("Core2Web");
	}
}



//same working for 'CHECKED EXCEPTION' as above code of 'UNCHECKED'


class DemoNew {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.close();

		String s = null;

		try {

			s = br.readLine();
			System.out.println("In try");
		}

		//no catch for checked exception br.readLine, we gotta 'throws' it

		finally {

			System.out.println("Clean-Up");
		}

		for(int i = 1; i <= 3; i++)
			System.out.println("Core2Web");
	}
}