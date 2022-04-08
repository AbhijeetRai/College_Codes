#include<stdio.h>

void main() {
	
	int i;
	float f;
	char c;
	
	int* intPtr = &i;
	float* floatPtr = &f;
	char* charPtr = &c;

	printf("Enter int value\n");
	scanf("%d", intPtr);

	printf("Enter float value\n");
	scanf("%f", floatPtr);

	printf("Enter char value\n");
	scanf(" %c", charPtr);

	printf("Int value is %d\n", i);
	printf("Float value is %f\n", f);
	printf("Char value is %c\n", c);
}
