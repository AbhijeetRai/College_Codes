#include<stdio.h>

//ASCII value of any charater is considered in both, expression of switch and case label of switch
void main() {
	
	int a = 65;

	switch(a) {
		
		case 'A' : 
			printf("char A\n");

		case 65 :
			printf("65\n");
	}

	char ch = 'a';

	switch(ch) {
		
		case 97 :
			printf("char z\n");

		case 'a':
			printf("97\n");
	}

	//thus we cannot use any int value and char with ascii of that int value`
}
