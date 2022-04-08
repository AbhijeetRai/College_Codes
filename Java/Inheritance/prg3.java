class DemoParent {


	/**
	 * Definition of getClass() for understanding purpose, because definition is not given in source code.
	 * As getClass() is native.
	 *
	 * Class getClass() {
	 *
	 *	print(this.Class_Name)		//this matlab, yaha control kiske wajah se aya originally.
	 * }
	 */

	void gun() {

		//this matlab is line pe control kaunse class k wajah se aya hai originally.
		System.out.println(this);
	}
}

class Demo extends DemoParent {

	/**
	 * Definition of getClass() for understanding purpose, because definition is not given in source code.
	 * As getClass() is native.
	 *
	 * Class getClass() {
	 *
	 *	print(this.Class_Name)		//this matlab, yaha control kiske wajah se aya originally.
	 * }
	 */

	void fun() {

		System.out.println(getClass());
		System.out.println("super.gettClass() -> " + super.getClass()); //this of Demo is passed.
		System.out.println(new DemoParent().getClass());

		super.gun();
		System.out.println();
	}

	public static void main(String[] args) {

		new Demo().fun();
		new DemoParent().gun();
	}
}
