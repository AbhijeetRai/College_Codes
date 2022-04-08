extern int printf(const char *, ...);

void main() {
	
	switch(4) {
		
		case 4 :
			printf("Captain America\n");

		case 'A' :
			printf("Iron Man\n");

		case 'z' :
			printf("Thor\n");
	}
	
	//case label must be inside switch only
	case 12 :
		printf("1\n");

}
