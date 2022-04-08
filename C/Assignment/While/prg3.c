#include<stdio.h>

void main() {
	
	float farenheit = 0;

	while(farenheit <= 100) {
		
		printf("%.2f C = %.2f F\n", (farenheit - 32) * 5 / 9, farenheit);
		farenheit++;
	}
}
