//constructor has less priority than instance block

class Demo {

	{

		System.out.println("Block-3");
	}

	{

		System.out.println("Block-1");
	}

	Demo() {

		System.out.println("In constructor");
	}

	{
		System.out.println("Block-2");
	}

	public static void main(String[] args) {

		new Demo();
	}
}
