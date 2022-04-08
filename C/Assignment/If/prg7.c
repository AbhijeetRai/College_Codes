#include<stdio.h>

void main() {
	
	int weight = 50;

	//'&&' got false on left side itself, so expression on right of '&&' is not even evaluated
	if(weight < 50 && weight > 30){
		printf("You are under weight\n");
	}
	
	//true for both comparison, if will be executed
	if(weight >= 50 && weight <= 70) {

		printf("you are well maintained\n");
	}

	//if holds false, null statement bound to if (;), will not be executed. But block will be executed
	if(weight > 70) ; {

		printf("you are overweight you have to work hard\n");
	}
}
