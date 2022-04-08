#include<stdio.h>

void main() {
	
	int a = 5, b = 10, ans;
	//ans = a +++++ b;

	/**
	 * Error on line 6, 
	 * a +++++ b was tokenised as a ++ ++ + b
	 * at second '++' there was no operand, thus it was demanding for operand by giving error
	 * lvalue required as increment operand 
	 */
	
	// we can explicitly give expression like this
	ans = a ++ + ++ b;
	printf("%d %d %d\n", a, b, ans);
}	
