/**
 * Any statement that occupies space in memory(RAM) is definition statement.
 * Statement which does not occupy space in memory is declaration statement
 */

#include<stdio.h>
void main() {
	
	int a; 		//defintion statement, occupies space in Memory with Garbage Value
	int b = 30;	//definition statement

	printf("%d\n", a);
	printf("%d\n", b);
	printf("%ld\n", sizeof(a));
	printf("%ld\n", sizeof(b));
}
