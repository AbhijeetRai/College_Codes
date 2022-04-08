#include<stdio.h>

void main() {
	
	int number;

	printf("Enter a number\n");
	scanf("%d", &number);

	if(number >= 25 && number <= 50)
		printf("%d lies in range of 25 to 50\n", number);

	else
		printf("%d does not belong in range of 25 to 50\n", number);

}
