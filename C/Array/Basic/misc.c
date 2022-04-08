#include<stdio.h>

void gun(int a) {

	printf("%d in gun\n", a);
}

void fun(char c) {
	
	printf("%c in fun\n", c);
}

void main() {
	
	int a1 = 75.4;
	printf("%d\n", a1);
	
	char c = 65.11;
	printf("%c\n", c);

	int a = 41l;
	printf("%d\n", a);

	double d = 41.2f;
	printf("%lf\n", d);

	float g = 10;
	printf("%f\n", g);

	int b = 'Z';
	printf("%d\n", b);

	char ch = 65;
	printf("%c\n", ch);

	fun(70);
	gun(70.2);
}
