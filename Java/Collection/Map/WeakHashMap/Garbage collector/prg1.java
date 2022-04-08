class GCDemo {

	public static void main(String[] args) {

		System.gc();
		System.out.println("In main");
		/**
		 * Finalise method of GCDEMO is not called because
		 * right now, no refrence of GCDEMo is null.
		 */
	}

	protected void finalize() {

		System.out.println("In finalise method");
	}
}
