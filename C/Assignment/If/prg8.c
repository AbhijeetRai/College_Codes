#include<stdio.h>

void main() {
	
	int year = 2020;

	/**
	 * The logic for leap year is simple, if any year is divisible by 400, it is leap 
	 * OR
	 * if year is non centurion(year not divisible by 100) AND year is divisible by 4, then it is leap.
	 */
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

		printf("%d year is leap year\n", year);
	}
}
