extern int printf(const char *, ...);

void main() {
	
	int marks = 77;
	
	/**
	 * Now ';' (null statement) is bounded to if. So in case, 'if' condition does not hold true,
	 * statement bounded to 'if' will not be executed. And rest of block has independent scope from if
	 * Rest of the block will be executed
	 */
	if(marks > 93); {
		
		printf("Laptop\n");
		printf("Bike\n");
		printf("Watch\n");
	}

	printf("T-Shirts\n");
}	
