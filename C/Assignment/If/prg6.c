#include<stdio.h>

void main() {

	int subVal = 15;
	
	//subVal++ returns 15, thus '&&' executes expression on right. Which returns 16. Subval becomes 15
	if(subVal++ && subVal--) {

		printf("SubVal : %d\n",subVal);
	}
	
	//subVal-- returns 15, which is true for '||'. Thus expression on right of '||' is not executed. subVal is 14
	if(subVal-- || ++subVal) {

		printf("SubVal : %d\n",subVal);
 	}

	if(subVal > subVal); {//if holds false, null statement bound to if will not be executed. Block will be executed and print 14

		printf("SubVal : %d\n",subVal);
	}	
}

