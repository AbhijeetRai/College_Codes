#include<stdio.h>

void main() {
	
	int start, end;

	printf("Enter starting and ending values\n");
	scanf("%d %d", &start, &end);

	while(start <= end) {
		
		if(start % 2 == 0)
			printf("%d\n", start * start * start);

		else
			printf("%d\n", start * start);

		start ++;
	}
}
