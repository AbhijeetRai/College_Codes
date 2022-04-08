#include<stdio.h>

void main() {

	switch(2) {

		case 1 :
			printf("Case 1\n");
			break;

		case 2:
			goto goodmorning;
			break;
	}

	goodmorning :
		printf("Good morning!!\n");
}
