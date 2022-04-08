#include<stdio.h>

void main() {
	
	int a = 5, b = 6, c = 7, ans = 0;

	ans = a * b / c;
	printf("%d\n", ans);

	ans = a + b / c - a * b;
	printf("%d\n", ans);
}
