
// % operator needs int as both operands in c
#include<stdio.h>

void main() {
	
	printf("%d\n", 3.4 % 2);
	printf("%d\n", 6.8 % 3);
	printf("%d\n", 6.8 % 3.4);

	printf("%f\n", 4.5f % 2);
}
