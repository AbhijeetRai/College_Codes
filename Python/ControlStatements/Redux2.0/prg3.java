/**
 * In 'Java' however, if we write something beneath break and continue. They become unreachable
 * and we get a syntax error of 'unreachable statement'
 */
class Demo {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			
			if(i == 2) {
				
				continue;
				System.out.println("i is 2");
			}

			else if(i == 4) {
				
				break;
				System.out.println("i is 4");
			}

			else
				System.out.println(i);
		}
	}	
}
