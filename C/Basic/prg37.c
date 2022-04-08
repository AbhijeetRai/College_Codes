#include<stdio.h>

void main() {
	
	int a, ans;

	a = 10, ans = 0;
	ans = ++a;
	printf("%d %d\n", a, ans);

	a = 10, ans = 0;
	ans = a++;
	printf("%d %d\n", a, ans);

	a = 10, ans = 0;
	ans = --a;
	printf("%d %d\n", a, ans);

	a = 10, ans = 0;
	ans = a--;
	printf("%d %d\n", a, ans);
}
