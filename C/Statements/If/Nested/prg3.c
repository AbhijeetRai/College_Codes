extern int printf(const char *, ...);

void main() {
	
	int marks = 80;
	int compMarks = 90;

	if(marks > 70) {

		printf("FC / Modern?\n");

		if(compMarks > 70)
			printf("FC\n");

		else
			printf("Garware\n");
	}

	else
		printf("Sports-Man\n");

	printf("Out\n");

}	
