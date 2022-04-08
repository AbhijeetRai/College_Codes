extern int printf(const char *, ...);
extern int scanf(const char *, ...);

void main() {
	
	float val1, val2, val3;

	printf("Enter three float values\n");
	scanf("%f %f %f", &val1, &val2, &val3);
	printf("val1 = %f\nval2 = %f\nval3 = %f\n", val1, val2, val3);
}
