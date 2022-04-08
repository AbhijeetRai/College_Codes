#include<stdio.h>

void main() {
	
	int ilc = 15, olc = 25;

	if(olc > ilc) { //if holds true(1), this will be executed

		printf("olc : %d\n", olc);
	}

	if(ilc < olc); { //if holds true, null statement bound to if will be executed and block will be executed too. Block is independet of if

		printf("ilc : %d\n",ilc);
	}

	printf("olc : %d\n",olc);
	printf("ilc : %d\n",ilc);
}
