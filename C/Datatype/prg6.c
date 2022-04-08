#include<stdio.h>

void main() {
	
	int arrAge[4] = {29, 28, 29, 30};
	char arrGrade[4] = {'A', 'B', 'C', 'D'};

	for(int i = 0; i <= 3; i++)
		printf("%d  %c\n", arrAge[i], arrGrade[i]);
}
