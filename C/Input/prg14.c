extern int printf(const char *, ...);
extern int scanf(const char *, ...);

void main() {
	
	int x;
	float f;
	char ch;

	printf("Enter value for int, float and char\n");
	scanf("%d%f %c", &x, &f, &ch);

	printf("int = %d\n", x);
	printf("float = %f\n", f);
	printf("char = %c\n", ch);
}
