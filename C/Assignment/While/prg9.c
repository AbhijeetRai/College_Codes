#include<stdio.h>

void main() {
	
	int days;

	printf("Enter No of days to complete the assignment\n");
	scanf("%d", &days);

	while(days > 0) {
		
		printf("%d days remaining\n", days);
		days --;
	}

	printf("0 days remaining, Assignment overdue\n");
}
