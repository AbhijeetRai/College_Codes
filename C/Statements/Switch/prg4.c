extern int printf(const char *, ...);

void main() {
	
	int a = 2, b = 3;
	
	//This is why break is neccessary to break the flow of switch
	switch(a + b) {
		
		case 1 :
			printf("One\n");

		case 5 :
			printf("Five\n");

		case 4 :
			printf("Four\n");

		case 3 :
			printf("Three\n");
			break;

		case 2:
			printf("Two\n");
	
	}
}
