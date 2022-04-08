#include<stdio.h>

void main() {
	
	float x = 5.2, y = 10.5;
	
	//float on left is being compared to double on right. In process float is promoted to double and there is loss of precision in float. Thus if does not hold true
	//This rule is eligible in Java, too.
	if(x == 5.2) {

		printf("x : %f\n", x);

		if(y == 10.5) ; {

			printf("y : %f\n", y);
		}
	}
}

