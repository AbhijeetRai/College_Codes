extern int printf(const char *, ...);

void main() {
	
	int userName = 12;
	int password = 456;

	if(userName == 123 && password == 456)
		printf("Successful Login\n");
	
	else
		printf("Invalid username or password\n");

	printf("Done\n");
}
