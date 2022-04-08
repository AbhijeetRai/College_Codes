import java.io.*;

class Demo {

	final static int b;

	public static void main(String[] args) throws IOException {

		final int a = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		b = Integer.parseInt(br.readLine());

		a += 1;
	}
}
/**
 * We can neither read value in final variable, nor change their value
 */
