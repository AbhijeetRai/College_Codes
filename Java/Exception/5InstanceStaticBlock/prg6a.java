class Demo {

	//it is possible to write nested instance blocks and instance blocks within some function
	{
		System.out.println("PM");
		{

			System.out.println("Demonetisation");
			{

				System.out.println("Lives Suffered");
			}
		}
	}

	public static void main(String[] args) {

		{
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
