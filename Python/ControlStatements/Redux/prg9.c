#include<stdio.h>

void main() {

	if(1)
		printf("In first if\n");

	if("Hi")
		printf("In second if\n");

	if('H')
		printf("In third if\n");

	//comparison strictly returns int
	printf("%d\n", 2 > 1);
}
