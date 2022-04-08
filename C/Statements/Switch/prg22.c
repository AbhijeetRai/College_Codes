#include<stdio.h>

void main() {
	
	int a = 1;
	
	//here after computation it acts like switch(1, 2, 3). Thus compiler looks for value 3 in switch as case
	switch(a, a + 1, a + 2) {
		
		case 1 :
			printf("PPA ");
			break;

		case 2 :
			printf("Java ");
			break;

		default :
			printf("Core2Web ");
			break;
	}
}
