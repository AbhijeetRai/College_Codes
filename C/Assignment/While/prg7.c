#include<stdio.h>

void main() {
	
	char start, end;

	printf("Enter starting and ending character\n");
	scanf("%c %c", &start, &end);

	while(start <= end) {
		
		if(start == 'A' || start == 'a' || start == 'E' || start == 'e' || start == 'I' || start == 'i' || start == 'O' || start == 'o' || start == 'U' || start == 'u')
			printf("%c = Vowel\n", start);

		else
			printf("%c = Consonant\n", start);

		start ++;
	}
}
