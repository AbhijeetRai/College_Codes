#include<stdio.h>
#include<stdbool.h>

void main() {
	
	//'C' does not have boolean, as in-built data type.
	//However we can use a header file, explicitly
	bool val = false, var = true;

	if(val); { //val holds false, null statement bound to if will not be executed, block will be executed independently of if

		printf("true\n");
	}

	if(var) {//var holds true, if will be executed

		printf("false\n");	
	}
}
