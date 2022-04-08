#include<stdio.h>

void main() {
	
	char *ptr1 = "Abhi"; 			//'\0' added by default
	char ptr2[] = "Abhi";			//'\0' added by default
	char ptr3[] = {'A', 'b', 'h', 'i'};	//'\0' not added
	
	printf("%s %s %s\n", ptr1, ptr2, ptr3);	
	//for ptr3, 'AbhiAbhi' is getting printed
	//Which is why, while using character array, it is recommended to add '\0' explicitly.

	char ptr4[] = {'A', 'b', 'h', 'i', '\0'};
	printf("%s\n", ptr4);
}
