#include<stdio.h>

void main() {
	
	int x = 5, ans = 0;
	ans = ++x + ++x + ++x;
	printf("%d %d\n", ans, x);
	
	x = 5;
	ans = x++ + x++ + x++;
	printf("%d %d\n", ans, x);

}
