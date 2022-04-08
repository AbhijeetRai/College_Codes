//Array of function pointer, and passing array of function pointer to another function

#include<stdio.h>

void add(int x, int y) {

	printf("%d\n", x + y);
}

void sub(int x, int y) {

	printf("%d\n", x - y);
}

void mul(int x, int y) {

	printf("%d\n", x * y);
}

void div(int x, int y) {

	printf("%d\n", x / y);
}

void operate(void (*ptrarr[4])(int, int)) {

	printf("MENU\n");
	printf("0.Add\n");
	printf("1.Sub\n");
	printf("2.Mul\n");
	printf("3.Div\n");

	int ch;
	scanf("%d", &ch);

	ptrarr[ch](10, 10);
}

void main() {

	void (*fptr[4])(int, int) = {add, sub, mul, div};
	//as we are providing initialiser at the same line,
	//even if we wouldn't have mentioned [4] as size, it would have been okay

	operate(fptr);
}
