/**
 * While dividing or finding out the remainder, GENERALLY just consider one formula in mind
 * Divident = Divisor * Quotient + Remainder
 */

#include<stdio.h>

void main() {
	
	printf("%d\n", -7 / -4);
	printf("%d\n", -7 / 4);
	printf("%d\n", 7 / -4);
	printf("%d\n", 7 / 4);

	printf("\n");

	printf("%d\n", -7 % -4);
	printf("%d\n", -7 % 4);
	printf("%d\n", 7 % -4);
	printf("%d\n", 7 % 4);

	printf("\n\n");
	
	printf("%d\n", -4 / -7);
	printf("%d\n", -4 / 7);
	printf("%d\n", 4 / -7);
	printf("%d\n", 4 / 7);

	printf("\n");

	//quotient is 0.
	printf("%d\n", -4 % -7);
	printf("%d\n", -4 % 7);
	printf("%d\n", 4 % -7);
	printf("%d\n", 4 % 7);
}
