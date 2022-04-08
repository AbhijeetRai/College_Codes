#include<stdio.h>

void main() {
	
	char aChar;

	printf("Enter a character\n");
	scanf("%c", &aChar);

	if(aChar == 'A' || aChar == 'E' || aChar == 'I' || aChar == 'O' || aChar == 'U'|| aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u')
		printf("%c is vowel\n", aChar);

	else
		printf("%c is consonant\n", aChar);
}
