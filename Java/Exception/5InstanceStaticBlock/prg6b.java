class Demo {

	//it is not possible to write nested static blocks and instance blocks within some function
	/*static*/ {
		System.out.println("PM");
		 {

			System.out.println("Demonetisation");
			{

				System.out.println("Lives Suffered");
			}
		}
	}

	public static void main(String[] args) {

		 static {
			System.out.println("PM...");
			{

				System.out.println("Demonetisation...");
				{

					System.out.println("Lives Suffered...");
				}
			}

		}
	}
}
