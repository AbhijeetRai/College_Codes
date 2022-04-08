#include<stdio.h>

void main() {
	
	int a = 5, b = 4;
	//put values, and follow precedence
	a = a++ + ++a + b++ / 2;
	//  5   + 7   + (4 / 2)
	printf("%d\n", a);

	a = 5, b = 4;
	//normal rules of pre and post, (grouping and returning references)
	a = a++ + b++ + ++a + 3;
	printf("%d\n", a);
}
