#include<stdio.h>

void main() {

	char val1, val2;

	printf("Enter character value\n");
	scanf("%c", &val1);

	printf("Enter character value\n");
	scanf(" %c", &val2);

	printf("val1 is %c\n", val1);
	printf("val2 is %c\n", val2);
}
