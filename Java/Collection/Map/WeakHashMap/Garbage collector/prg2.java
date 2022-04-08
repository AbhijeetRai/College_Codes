class GCDemo {

	public static void main(String[] args) throws Throwable {

		GCDemo obj = new GCDemo();
		obj = null;
		System.gc();
		//Thread.sleep(1000);
		System.out.println("In main");
	}

	protected void finalize() {

		System.out.println("In finalise method of GCDEMo");
	}
}
