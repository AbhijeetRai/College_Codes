#include<stdio.h>

void main() {
	
	int i;
	float f;
	char c;
	
	int* intPtr = &i;
	float* floatPtr = &f;
	char* charPtr = &c;

	printf("Enter int value, float value and char value\n");
	scanf("%d%f %c", intPtr, floatPtr, charPtr);

	printf("Int value is %d\n", i);
	printf("Float value is %f\n", f);
	printf("Char value is %c\n", c);
}
