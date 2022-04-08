/**
 * Errors in operators and expressions
 */

#include<stdio.h>

void main() {
	
	int a = 4, b = 9, ans;
	
	a++; //no error
	++b; //no error
	//5++; // Error - lvalue required as increment operand. 
	//increment or decrement can be performed only on variables, not on constants.
	
	//mind that on line 11 and 12, value of a and b has increased by 1
	ans = a+++b; // tokenised as a++ + b
	printf("%d %d %d\n", a, b, ans);
}
