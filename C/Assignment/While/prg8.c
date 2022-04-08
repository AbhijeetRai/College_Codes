#include<stdio.h>

void main() {
	
	int number, diff;

	printf("Enter number\n");
	scanf("%d", &number);

	if(number % 2 == 0)
		diff = 1;

	else
		diff = 2;

	while(number >= 1) {
		
		printf("%d\n", number);
		number -= diff;
	}
}
