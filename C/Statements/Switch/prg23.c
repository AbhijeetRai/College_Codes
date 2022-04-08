#include<stdio.h>

void main() {
	
	int a = 4;

	switch(a, a + 1, 10 - a) {
		
		case 4 :
			printf("case 4\n");
			break;

		case 5 :
			printf("case 5\n");
			break;

		case 6 :
			printf("case - 6\n");
			break;
	}
}
