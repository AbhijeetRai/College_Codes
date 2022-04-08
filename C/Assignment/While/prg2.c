#include<stdio.h>

void main() {
	
	int number, count = 0;

	printf("Enter the number\n");
	scanf("%d", &number);

	while(number > 0) {
		
		count += 1;
		number /= 10;
	}

	printf("Count = %d\n", count);
}
