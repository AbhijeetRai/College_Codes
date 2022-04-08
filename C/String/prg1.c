#include<stdio.h>

void main() {
	
	char *ptr1 = "Core2Web";
	char *ptr2 = "Shashi";
	
	//Pointers are looking at first character only
	printf("%c %ld\n", *ptr1, sizeof(*ptr1));
	printf("%c %ld\n", *ptr2, sizeof(*ptr2));
}
