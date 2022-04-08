#include<stdio.h>

void main() {

	int a = 5, b = 10;
	int ans  = a +++ b; 	//tokenised as a++ + b
	printf("%d %d %d\n", a, b, ans);

	/**
	 * Also the error we got in last program, at a+++++b 
	 * that was tokenised as a++ ++ +b
	 *
	 * rather we can explicitly make as a++ + ++b
	 */

	a = 5, b = 10;
	ans = a++ + ++b;
	printf("%d %d %d\n", a, b, ans);
}
