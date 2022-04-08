#include<stdio.h>

void fun();

void main() {

	for(int i = 1; i <= 5; i++) {
		
		fun();
	}

}

void fun() {

	int a = 10;
	a = a + 1;

	printf("%d\n",a); 
}