class Mera implements Thread.UncaughtExceptionHandler {

	//we can change identifier of paramters while overriding a method. But do not change anything like
	//name of method or sequence or order or type or number of paramters
	public void uncaughtException(Thread t1, Throwable e1) {

		System.out.println("Exception aya..");
	}
}

class Demo {

	public static void main(String[] args) throws Exception {

		Thread.setDefaultUncaughtExceptionHandler(new Mera());
		System.out.println(10 / 0);
	}
}
