#include <stdio.h>

struct integer {

	int a;
	int b;
}numbers = {10, 20};

void fun(struct integer numbers) {

	int temp = numbers.a;
	numbers.a = numbers.b;
	numbers.b = temp;
}

int main(int argc, char *argv[]) {

	printf("Before swap, a = %d b = %d\n", numbers.a, numbers.b);
	fun(numbers);
	printf("After swap, a = %d b = %d\n", numbers.a, numbers.b);
}