class Test {

	Test i;

	public static void main(String[] args) {

		/**
		 * GC picks objects with heap to heap refrence as well in case of user defined class
		 * There must be reference from stack to be avoided by gc()
		 */
		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println(t1+" "+t2);

		t1.i = t2;
		t2.i = t1;

		t1=null;
		t2=null;

		System.out.println(t1+" "+t2);

		System.gc();
		System.out.println(t1+" "+t2);
	}

	public void finalize()throws Throwable {

		System.out.println("Finalize");
	}
}
