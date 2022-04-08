#include<stdio.h>

void main() {
	
	int number = 10;

	if(number != 0 && number > 0) { //true 

		printf("%d is a positive no\n", number);
		number = -5;	//number is -5 now
	}

	if(number< 0) {	//true

		printf("%d is a negtive no\n", number);
		number = 0;	//no is 0 now
	}

	if(number == 0) {	//true

		printf("number is zero\n");
		number = 15;	//number is 15
	}

	if(number % 4 == 0) ; { //false. Statement bound to if, null statement ';' won't be executed. But block will be executed

		printf("%d is divisible by 4\n", number);
	}
}
