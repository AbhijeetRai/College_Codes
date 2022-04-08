#include<stdio.h>

void main() {
	
	char *ptr1 = "Core2Web";
	char *ptr2 = "Shashi";

	printf("%ld\n", sizeof(ptr1));
	printf("%ld\n", sizeof(ptr2));
	printf("%ld\n", sizeof("Core2Web"));
	printf("%ld\n", sizeof("Shashi"));

	printf("\n");

	char arr1[] = "Core2Web";
	char arr2[] = "Shashi";

	printf("%ld\n", sizeof(arr1));
	printf("%ld\n", sizeof(arr2));

	printf("\n");

	char arr3[] = {'C', 'o', 'r', 'e', '2', 'W', 'e', 'b'};
	char arr4[] = {'S', 'h', 'a', 's', 'h', 'i'};

	printf("%ld\n", sizeof(arr3));
	printf("%ld\n", sizeof(arr4));
}
