extern int printf(const char *, ...);

void main() {
	
	int a = 5;
	int b = 10;
	int c = 0;

	if(a && b)
		printf("Core2Web\n");

	if(b && c)
		printf("BiEncaps\n");

	if(b || c)
		printf("Amazon\n");
}
