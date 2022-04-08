#include<stdio.h>

void main() {
	
	int x = 10;
	float y = 20.5;
	double d = 60.320;
	char ch = 'A';

	//We cannot simply assign a value to void
	//void occupeis no memory, however just for representation purpose 
	//minimum size (that is 1 byte) is shown for void size, in sizeof operator.
	
	//Error - variable or field 'v' decalred void
	void v = 30;
}
