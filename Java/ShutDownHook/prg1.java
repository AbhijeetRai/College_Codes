class Demo {
	
	public static void main(String[] args) {

		Runtime.getRuntime().addShutdownHook( 
		
			new Thread() {
			
				public void run() {
				
					System.out.println("CLEAN UP!!");
				}
			});
	}
}
