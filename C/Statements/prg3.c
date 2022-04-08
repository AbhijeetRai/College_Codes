#include<stdio.h>

void main() {
	
	for(int i = 1, j = 1, k = 1, l = 1; (i <= 3 || j <= 3) || (k <= 3 || l <= 3); i++, j++, k++, l++)
		printf("%d %d %d %d \n", i, j, k, l);
}
