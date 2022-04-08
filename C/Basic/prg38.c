#include<stdio.h>

void main() {
	
	int a, b, ans;

	a = 5, b = 6, ans = 0;
	ans = a+++b; 				//tokenised as a++ + b
	printf("%d %d %d\n", a, b, ans);

	a = 5, b = 6, ans = 0;
	ans = ++a + b;
	printf("%d %d %d\n", a, b, ans);

	a = 5, b = 6, ans = 0;
	ans = a --- b; 				//tokenised as a-- - b
	printf("%d %d %d\n", a, b, ans);

	a = 5, b = 6, ans = 0;
	ans = --a + b;
	printf("%d %d %d\n", a, b, ans);
}
