#include <stdio.h>

struct integer {
	
	int a;
	int b;
}numbers = {10, 20};

void fun(int a, int b) {

	int temp = a;
	a = b;
	b = temp;
}

int main(int argc, char *argv[]) {
	
	printf("Before swap ->> a = %d, b = %d\n", numbers.a, numbers.b);
	fun(numbers.a, numbers.b);
	printf("After swap ->> a = %d, b = %d\n", numbers.a, numbers.b);
}
