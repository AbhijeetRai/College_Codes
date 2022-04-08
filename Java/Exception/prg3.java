/**
 * Even compile time(checked exception) gave full path.
 * Exception in thread "main" java.io.IOException: Stream closed
 */

import java.io.*;

class Demo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.close();
		String s = br.readLine();
	}
}
