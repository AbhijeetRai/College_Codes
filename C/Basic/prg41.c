#include<stdio.h>

void main() {
	
	int a, b, c, ans;

	a = 5, b = 6, c = 7;
	ans = a++ + b ++ + ++c;
	printf("%d %d %d %d\n", a, b, c, ans);

	a = 5, b = 6, c = 7;
	ans = ++a + b ++ + ++c;
	printf("%d %d %d %d\n", a, b, c, ans);
}
