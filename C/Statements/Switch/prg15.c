#include<stdio.h>

//ASCII value of any charater is considered in both, expression of switch and case label of switch
void main() {

	int a = 65;

	switch(a) {

		case 'A' :
			printf("char A\n");
	}

	char ch = 'a';

	switch(ch) {

		case 97 :
			printf("char a\n");
	}
}
