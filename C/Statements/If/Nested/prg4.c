extern int printf(const char *, ...);

void main() {
	
	int marks = 80;

	if(marks > 80)
		printf("FC\n");

	else if (marks > 70)
		printf("Modern\n");

	else if (marks > 60)
		printf("Garware\n");

	else
		printf("Jai Kranti\n");
}
