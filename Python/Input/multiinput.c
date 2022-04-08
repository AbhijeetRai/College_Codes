#include<stdio.h>

void main() {

	int roll;
	char name[20];
	char city[10];

	printf("Enter roll,name and city\n");
	scanf("%d%s%s",&roll,name,city);

	printf("%d\t%s\t%s\n",roll,name,city);
}