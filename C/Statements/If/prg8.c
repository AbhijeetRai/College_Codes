#include<stdio.h>

void main() {
	
	float f = 1.2;
	printf("%ld\n", sizeof(f));	//f   is considered as float
	printf("%ld\n", sizeof(1.2));	//1.2 is considered as double
	
	//f to be compared with double, so it gets promoted, but while getting promoted, it looses its precision
	// and becomes 1.2000001 or something like that
	if(f == 1.2)
		printf("Equal\n");

	else
		printf("Unequal\n");


	


	f = 1.5;

	if(f == 1.5)
		printf("SAME\n");
	
	else
		printf("DIFFERENT\n");
}
