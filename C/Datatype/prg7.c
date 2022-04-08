#include<stdio.h>

void main() {
	
	int *a;
	char *c;
	float *f;
	double *d;
	void *v;

	printf("Size of integer pointer %ld\n", sizeof(a));
	printf("Size of character pointer %ld\n", sizeof(c));
	printf("Size of float pointer %ld\n", sizeof(f));
	printf("Size of double pointer %ld\n", sizeof(d));
	printf("Size of void pointer %ld\n", sizeof(v));

	printf("\n");

	
	printf("Size of integer pointer %ld\n", sizeof(int *));
	printf("Size of character pointer %ld\n", sizeof(char *));
	printf("Size of float pointer %ld\n", sizeof(float *));
	printf("Size of double pointer %ld\n", sizeof(double *));
	printf("Size of void pointer %ld\n", sizeof(void *));
}
