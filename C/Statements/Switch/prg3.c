#include<stdio.h>

void main() {
	
	int a = 3;

	switch(a) {
		
		case 4 :
			printf("Four\n");
			printf("4\n");

		case 3 :
			printf("Three\n");
			printf("3\n");
	}
	
	//matching case nai b mila to b, koi issue nai
	switch(a) {
		
		case 41 :
			printf("Four\n");
			printf("4\n");

		case 23 :
			printf("Three\n");
			printf("3\n");
	}

	printf("Outside switches\n");
}
