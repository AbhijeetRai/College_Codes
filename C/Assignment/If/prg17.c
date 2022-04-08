#include<stdio.h>

void main() {
	
	int n1, n2, n3, largest;

	printf("Enter three numbers\n");
	scanf("%d%d%d", &n1, &n2, &n3);

	if(n1 >= n2 && n1 >= n3)
		largest = n1;

	else if(n2 >= n3)
		largest = n2;

	else
		largest = n3;

	printf("Largest is %d and %s\n", largest, largest % 2 == 0 ? "Even" : "Odd");
}
