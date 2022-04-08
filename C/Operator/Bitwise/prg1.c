#include<stdio.h>

void main() {
	
	int a = 10, b = 15, ans;

	ans = a & b;
	printf("%d\n", ans);	//10

	a = 3, b = 6;
	ans = a & b;
	printf("%d\n", ans); 	//2

	
	a = 7, b = 5;
	printf("%d\n", a & b);	//5
}
