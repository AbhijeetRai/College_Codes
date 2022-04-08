#include<stdio.h>

void main() {
	
	int range, sum = 0, mult = 1, i = 1;

	printf("Enter upper value of range\n");
	scanf("%d", &range);
	
	while(i <= range) {
		
		if(i % 2 == 0)
			sum += i;

		else
			mult *= i;

		i++;
	}

	printf("Sum = %d\nMult = %d\n", sum, mult);
}
