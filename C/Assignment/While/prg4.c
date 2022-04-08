#include<stdio.h>

void main() {
	
	int number, sum = 0, i = 1;

	printf("Enter a number to check whether it is perfect\n");
	scanf("%d", &number);

	while(i <= number / 2) {
		
		if(number % i == 0)
			sum += i;

		i++;
	}

	printf("%s\n", sum == number ? "Perfect" : "Not perfect");
}
