#include<stdio.h>

void main() {
	
	int a, ans;

	a = 5;
	ans = ++a + ++a;
	printf("%d %d\n", a, ans);

	a = 5;
	ans = --a + --a;
	printf("%d %d\n", a, ans);
}	
