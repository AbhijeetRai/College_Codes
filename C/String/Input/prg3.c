#include<stdio.h>

void main() {
	
	char actor[30], val;
	int index = 0;

	while( (val = getchar()) != '\n') {
		
		actor[index] = val;
		index++;
	}

	printf("%s\n", actor);
	actor[index] = '\0';

	for(int i = 0; actor[i] != '\0'; i++)
		printf("%c", actor[i]);
	printf("\n");
}
