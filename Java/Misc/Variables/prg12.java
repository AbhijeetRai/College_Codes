class Peshwa {
	
	int age = 100;

	class Shaniwar_Wada {
		
		int age = 50;

		void find_Age() {
			
			int age = 25;
			System.out.println(age + " " + this.age + " " + Peshwa.this.age);
		}
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		Peshwa.Shaniwar_Wada object = new Peshwa().new Shaniwar_Wada();
		object.find_Age();
	}
}
