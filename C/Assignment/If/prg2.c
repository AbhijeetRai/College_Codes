#include<stdio.h>

void main() {
	
	int a = 10, b = 20;
	
	//here 'and' of a and b++ is 'and' of 10 and 20, which is true. (PS-> b holds 21 now)
	//as there is 'and' between parenthese and it has got true on left, it will check parentheses on right
	//or of a++, b++ returns 10 on left(true). Operation ++b on right will not be executed. (PS-> a holds 11 now)

	if((a && b++) && (a++ || ++b)) {

		printf("a : %d\n",a);
		printf("b : %d\n",b);
	}

	printf("out of if\n");
}
