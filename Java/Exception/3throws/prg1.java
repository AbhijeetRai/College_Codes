import java.io.*;

class Demo {

	void gun() throws InterruptedException {
		
		Thread t = new Thread();
		t.start();
		t.sleep(5);
	}

	void fun() throws IOException, InterruptedException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first string");
		String str1 = br.readLine();

		System.out.println("Enter second string");
		String str2 = br.readLine();

		System.out.println("Enter third string");
		//readLine throws IOException
		String str3 = br.readLine();

		gun(); //we got to throws excpetions till JVM or catch aywhere
		//gun throws InterruptedException, fun has called it, so fun will also throw it
	}
	
	//main has called fun that throws IOException and InterruptedException.
	//so main must also throw those exception. Or it can throw their parents exception
	public static void main(String[] args) throws Exception {
		
		Demo d = new Demo();
		d.fun();
	}
}
