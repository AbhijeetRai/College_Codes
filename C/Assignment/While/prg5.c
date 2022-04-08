#include<stdio.h>
	
void main() {

	int i = 2, count = 0;

	while(i <= 50) {
		
		if(i % 5 == 0)

			count += 1;

		i += 2;
	}

	printf("Count = %d\n", count);
}
