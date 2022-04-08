extern int printf(const char *, ...);

void main() {

	//There can be two switches in a program
	switch(3) {

		case 3 :
			printf("Three\n");
			printf("3\n");
	}

	switch(2) {

		case 3 :
			printf("Three\n");
			printf("3");
			break;
	}
}
