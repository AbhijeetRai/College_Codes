#include<stdio.h>

void main() {

	goodmorning :
		printf("Good morning...\n");

	switch(2) {

		case 1 :
			printf("Case 1\n");
			break;

		case 2:
			goto goodmorning;
			break;
	}
}
