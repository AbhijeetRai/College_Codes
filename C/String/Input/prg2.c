#include<stdio.h>

void main() {
	
	char str1[15];
	printf("Enter your full name\n");
	scanf("%[^\n]", str1);	//Read until enter is encountered
	printf("%s\n", str1);
}
