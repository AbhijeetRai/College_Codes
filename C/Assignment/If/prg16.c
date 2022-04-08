#include<stdio.h>

void main() {
	
	char aChar;

	printf("Enter a character\n");
	scanf("%c", &aChar);

	if(aChar >= 65 && aChar <= 90)
		printf("UPPER CASE\n");

	else if(aChar >= 97 && aChar <= 122)
		printf("LOWER CASE\n");

	else
		printf("SPECIAL CHARACTER\n");
}
