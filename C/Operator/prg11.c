#include<stdio.h>

void main() {
	
	int a = 5, ans;
	ans = ++a + ++a;
	printf("%d %d\n", a, ans);

	ans = --a + --a;
	printf("%d %d\n", a, ans);
}
