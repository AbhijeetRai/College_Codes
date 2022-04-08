extern int printf(const char *, ...);

void main() {

	//float as expression or case label is not allowed in switch
	switch(1.1) {

		case 2.2 :
			printf("2.2\n");
	}

	switch(4.4) {

		case 2 :
			printf("4\n");
	}

	switch(1) {

		case 8.7 :
			printf("2.2\n");
	}
}
