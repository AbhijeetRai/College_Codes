#include<stdio.h>

void fun();

void main() {

	for(int i = 1; i <= 2; i++) {
		
		fun();
	}

}

void fun() {

	int a = 10;

	printf("%d\n",a); 
}