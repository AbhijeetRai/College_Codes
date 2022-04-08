#include<stdio.h>

void main() {
	
	int number1, number2;

	printf("Enter two integers: \n");
	scanf("%d %d", &number1, &number2);
	

	//if number1 is greater or equal to  number2
	if (number1 >= number2) {
		
		//if number1 is equal to number2
		if (number1 == number2) {

			printf(" %d = %d",number1,number2);
		}
		
		//numebr1 is greater than number2
		else {

			printf(" %d > %d", number1, number2);
		}
	}
	
	//number1 is smaller than number2
	else {
		printf(" %d < %d",number1, number2);
	}
}
