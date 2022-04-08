extern int printf(const char *, ...);
extern int scanf(const char *, ...);

void main() {
	
	int x;
	float f;
	char ch;

	printf("Enter value for int\n");
	scanf("%d", &x);

	printf("Enter value for float\n");
	scanf("%f", &f);

	printf("Enter value for char\n");
	scanf(" %c", &ch);

	printf("int = %d\n", x);
	printf("float = %f\n", f);
	printf("char = %c\n", ch);
}
