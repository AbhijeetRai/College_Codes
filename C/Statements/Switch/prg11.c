extern int printf(const char *, ...);

void main() {
	
	//we can have mixed cases of char and int
	switch(4) {
		
		case 4 :
			printf("Captain America\n");

		case 'A' :
			printf("Iron Man\n");

		case 'z' :
			printf("Thor\n");
	}
}
