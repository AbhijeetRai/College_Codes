#include<stdio.h>

void main() {
	
	char actor[20];
	printf("Enter favorite actor\n");
	fgets(actor, 25, stdin);
	printf("%s\n", actor);
}
